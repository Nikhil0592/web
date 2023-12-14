
import internal.GlobalVariable;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint;
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase;
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.checkpoint.Checkpoint;
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testcase.TestCase;
import com.kms.katalon.core.testdata.TestData;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.internal.Maps;
import com.google.common.collect.MapDifference


public class WebTableUtils {
	
	public static void compareActExpMap(String primaryKeyName, Map<String, Map<String, String>> actMap,
			Map<String, Map<String, String>> expMap, String regimeName) {
		int cntRecPassed = 0;
		int cntRecFailed = 0;
		int cntRecNotfound = 0;
		try {
			for (String actRecordKey : actMap.keySet()) {
				if (!expMap.containsKey(actRecordKey)) {
					cntRecNotfound++;
					System.out.println("Searched actual record not found in expected data :: " + primaryKeyName + " :: "
							+ actRecordKey);
				} else {
					// compare actual and expected map records
					MapDifference<String, String> diff = com.google.common.collect.Maps
							.difference(actMap.get(actRecordKey), expMap.get(actRecordKey));
					if (!diff.areEqual()) {
						cntRecFailed++;
						Map<String, MapDifference.ValueDifference<String>> entriesDiffering = diff.entriesDiffering();
						Map<String, String> entriesOnlyOnLeft = diff.entriesOnlyOnLeft();
						Map<String, String> entriesOnlyOnRight = diff.entriesOnlyOnRight();
						reportMapDifference(primaryKeyName, actRecordKey, entriesDiffering, entriesOnlyOnLeft,
								entriesOnlyOnRight);
					} else {
						cntRecPassed++;
						System.out.println("All values matched for " + primaryKeyName + " :: " + actRecordKey);
					}
				}
			}
		} catch (Exception exception) {
			System.out.println("Exception occurred in compareActExpMap");
			exception.printStackTrace();
		}
	}

	public static void getExpRecordMissingFrmActData(String primaryKeyName, Map<String, Map<String, String>> actMap,
			Map<String, Map<String, String>> expMap) {
		// Report records present in expected data but missing in actual data
		for (String expRecordKey : expMap.keySet()) {
			if (!actMap.containsKey(expRecordKey)) {

				System.out.println("Searched expected record not found in actual data :: " + primaryKeyName + " :: "
						+ expRecordKey);
			}
		}
	}

	public static void reportMapDifference(String recordKeyName, String recordKeyValue,
			Map<String, MapDifference.ValueDifference<String>> entriesDiffering, Map<String, String> entriesOnlyOnLeft,
			Map<String, String> entriesOnlyOnRight) {
		try {
			String failureMsg = "Value mismatch for field :: ";
			for (String keyName : entriesOnlyOnLeft.keySet()) {
				String actValue = entriesOnlyOnLeft.get(keyName);
				String expValue = " ** NOT FOUND ** ";
				System.out
						.println("Failed " + recordKeyName + " :: " + recordKeyValue + " " + actValue + " " + expValue);
			}
			for (String keyName : entriesOnlyOnRight.keySet()) {
				String actValue = " ** NOT FOUND ** ";
				String expValue = entriesOnlyOnRight.get(keyName);
				System.out
						.println("Failed " + recordKeyName + " :: " + recordKeyValue + " " + actValue + " " + expValue);
			}
			for (String keyName : entriesDiffering.keySet()) {
				String actValue = entriesDiffering.get(keyName).leftValue();
				String expValue = entriesDiffering.get(keyName).rightValue();
				System.out
						.println("Failed " + recordKeyName + " :: " + recordKeyValue + " " + actValue + " " + expValue);
			}
		} catch (Exception exception) {
			System.out.println("Exception occurred in reportMapDifference");
			exception.printStackTrace();
		}
	}

	public static void compareMap(String primaryKeyName, Map<String, Map<String, String>> actMap,
			Map<String, Map<String, String>> expMap, String regimeName) {
		try {
			if (actMap.size() != expMap.size()) {
				System.out.println("Record count MISMATCH :: " + "Actual record count :: " + actMap.size()
						+ " Expected record count :: " + expMap.size());
			} else if (actMap.size() == 0) {
				System.out.println("Map empty :: " + "Actual record count :: " + actMap.size()
						+ "Expected record count :: " + expMap.size());
			} else {
				System.out.println("Record count MATCHED :: " + "Actual record count :: " + actMap.size()
						+ "Expected record count :: " + expMap.size());
			}
			// using keySet() for iteration over keys
			compareActExpMap(primaryKeyName, actMap, expMap, regimeName);
			getExpRecordMissingFrmActData(primaryKeyName, actMap, expMap);
			// reportRecordsCompared();
		} catch (Exception exception) {
			System.out.println("Exception occurred in compareMap");
			exception.printStackTrace();
		}
	}
	
	public static Map<String, Map<String, String>> getExcelAsMap(WebElement table, String keyName) {
		Map<String, Map<String, String>> transactionRecords = new LinkedHashMap();
		int recordCounter = 0;
		try {

			List<String> excelData = readWebTableDataSmit(table);

			String colNames = excelData.get(0);
			String[] arrColName = colNames.split(",", -1);
			int columnCount = arrColName.length;
			for (String colValues : excelData) {
				String[] arrColValue = colValues.split(",", -1);
				Map<String, String> fileRecord = new LinkedHashMap<>();
				String mapKey = "";
				for (int i = 0; i < columnCount; i++) {
					String columnName = arrColName[i];
					if (columnName.equalsIgnoreCase(keyName))
						mapKey = arrColValue[i];
					fileRecord.put(columnName, arrColValue[i]);
				}
				if (keyName.equalsIgnoreCase("DEFAULT") || mapKey.equalsIgnoreCase("")) {
					transactionRecords.put(String.valueOf(recordCounter), fileRecord);
					recordCounter++;
				} else
					transactionRecords.put(mapKey, fileRecord);
			}
		} catch (Exception exception) {
			System.out.println("Exception occurred in compareMap");
			exception.printStackTrace();
		}
		return transactionRecords;
	}
	
	public static List<String> readWebTableDataSmit(WebElement tableElement) {
		List<String> tableData = new ArrayList<>();

		// Get all rows
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			// Get all cells in the current row
			String rowData = null;
			List<WebElement> headers = row.findElements(By.tagName("th"));
			List<WebElement> cells = row.findElements(By.tagName("td"));

			int count = 0;
			for (WebElement header : headers) {
				// Extract data from each cell and add it to the list
				if (count == 0) {
					rowData = header.getText();
				} else {
					rowData = rowData + "," + header.getText();
				}
				count++;
			}

			for (WebElement cell : cells) {
				// Extract data from each cell and add it to the list
				if (count == 0) {
					rowData = cell.getText();
				} else {
					rowData = rowData + "," + cell.getText();
				}
				count++;
			}
			tableData.add(rowData);
		}
		return tableData;
	}


}