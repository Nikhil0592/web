import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.url)
//
////private variable
//def name='Abhishek'
//println name
//
//WebUI.doubleClick(findTestObject('Object Repository/Page_Altoro Mutual/font_Sign In'))
//
//WebUI.doubleClick(findTestObject('Object Repository/Page_Altoro Mutual/input_Username_uid'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Altoro Mutual/input_Username_uid'), username)
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Altoro Mutual/input_Password_passw'), pwd)
//
//WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/input_Password_btnSubmit'))
WebUI.callTestCase(findTestCase('LoginBanking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Altoro Mutual/select_800002 Savings800003 Checking4539082_68f91c'), 
    '800003', true)

WebUI.doubleClick(findTestObject('Object Repository/Page_Altoro Mutual/h1_Account History - 800003 Checking'))

WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/h1_Account History - 800003 Checking'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Altoro Mutual/h1_Account History - 800003 Checking'))

WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/h1_Account History - 800003 Checking'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Altoro Mutual/h1_Account History - 800003 Checking'))

WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/h1_Account History - 800003 Checking'))

WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/font_Sign Off'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/a_ONLINE BANKING LOGIN'))

WebUI.setText(findTestObject('Object Repository/Page_Altoro Mutual/input_Username_uid'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Altoro Mutual/input_Password_passw'), pwd)

WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/input_Password_btnSubmit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Altoro Mutual/select_800002 Savings800003 Checking4539082_68f91c'), 
    '800003', true)

WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/input_View Account Details_btnGetAccount'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Altoro Mutual/h1_Account History - 800003 Checking'))

WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/font_Sig Off'))

WebUI.callTestCase(findTestCase('LoginBanking'), [('username') : 'jsmith', ('pwd') : 'KuC5M6xKe5uvO/soexOEDQ=='], FailureHandling.STOP_ON_FAILURE)

