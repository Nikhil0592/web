package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class LoginStepDefiniton {

	public String expectedAccountNo;

	@Given("the user is on the {string} website")
	public void the_user_is_on_the_website(String url) {
		// Write code here that turns the phrase above into concrete actions

		WebUI.openBrowser(url);
		//		WebUI.maximizeWindow();
		//		WebUI.deleteAllCookies();
	}

	@When("the user enters a valid (.*) and (.*)")
	public void the_user_enters_a_valid_jsmith_and_demo(String username,String password) {
		// Write code here that turns the phrase above into concrete actions
		WebUI.sendKeys(findTestObject('Object Repository/BankingLoginPageObjects/input_Username'), username)
		WebUI.sendKeys(findTestObject('Object Repository/BankingLoginPageObjects/input_Password'), password)
		WebUI.click(findTestObject('Object Repository/BankingLoginPageObjects/Submit_btn'))
		println(username)
		println(password)
	}

	@When("the user selects account no (.*) from the drop down and clicks on Go")
	public void the_user_selects_acoount_no(String accountNo) {
		// Write code here that turns the phrase above into concrete actions
		WebUI.selectOptionByValue(findTestObject('Object Repository/BankingHomePageObjects/selectDropDownAccount'),
				accountNo, true)
		WebUI.click(findTestObject('Object Repository/BankingHomePageObjects/getAccount_btn'))
	}


	@When("clicks on the Login button")
	public void clicks_on_the_Login_button() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/Page_Altoro Mutual/a_ONLINE BANKING LOGIN'))
	}

	@Then("the user should be logged in to the website")
	public void the_user_should_be_logged_in_to_the_website() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("the user should not be logged in to the website and displayed appropriate error message")
	public void the_user_should_not_be_logged_in_to_the_website_and_displayed_appropriate_error_message() {
		// Write code here that turns the phrase above into concrete actions
	}
}
