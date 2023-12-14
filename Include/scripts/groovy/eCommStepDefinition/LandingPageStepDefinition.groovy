package eCommStepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.junit.Assert.assertEquals

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

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

public class LandingPageStepDefinition {

	public String landingPageProductName;
	TestContextSetup testContextSetup;


	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

	@Given("User is on Greenkart Landing page")
	public void user_is_on_greenkart_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.openBrowser("https://rahulshettyacademy.com/seleniumPractise/#/")
		WebUI.maximizeWindow()
	}

	@When("extracts actual name of search product")
	public void user_extracted_actual_name_of_product()
	throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000l);
		testContextSetup.landingPageProductName=WebUI.getText(findTestObject('Object Repository/EcommOfferPageObjects/Tomaoto_Text')).split("-")[0].trim()

		println(testContextSetup.landingPageProductName)

	}

	@When("User searches with text {string}")
	public void user_searched_with_text(String partialSearchText)
	throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('Object Repository/EcommOfferPageObjects/input_KART_search-keyword'), partialSearchText)

	}

	@When("User selects and adds the product to cart from search results")
	public void user_add_product_to_cart()
	throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/EcommLandingPageObjects/button_ADD TO CART'))

	}
	
	@Then("User validates the product in the cart")
	public void user_searched_for_partial_text_in_offers_page() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/EcommLandingPageObjects/img'))
		String cartProductName=WebUI.getText(findTestObject('Object Repository/EcommLandingPageObjects/p_Cauliflower - 1 Kg')).split("-")[0].trim()
		assertEquals(testContextSetup.landingPageProductName, cartProductName)
		
	}
}
