package eCommStepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.junit.Assert.assertEquals

import org.openqa.selenium.WebDriver

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.Then
import internal.GlobalVariable
import stepDefinition.LoginStepDefiniton

public class OffersPageStepDefinition {

	public String offerPageProductName;
	TestContextSetup testContextSetup;

	public OffersPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}


	@Then("User searched for {string} partial text in Offers page")
	public void user_searched_for_partial_text_in_offers_page(String partialSearchText) {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/EcommLandingPageObjects/a_Top Deals'))

		WebUI.switchToWindowIndex(1)
		//		WebUI.switchToWindowTitle('GreenKart - veg and fruits kart')
		Thread.sleep(2000l)
		WebUI.setText(findTestObject('Object Repository/EcommOfferPageObjects/input_KART_search-keyword'), partialSearchText)
		offerPageProductName= WebUI.getText(findTestObject('Object Repository/EcommLandingPageObjects/td_Tomato'));
		println(offerPageProductName)

	}

	@Then("validate product name in Offers page matches with Landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		println("Expected"+testContextSetup.landingPageProductName)
		println("Actual"+offerPageProductName)
		assertEquals(testContextSetup.landingPageProductName, offerPageProductName);
		WebUI.closeBrowser();
	}
}
