$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/AddToCart.feature");
formatter.feature({
  "name": "Search and Place orders for Products",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add to Cart Experience for product in Home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Greenkart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches with text \"Cauliflower\"",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_searched_with_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "extracts actual name of search product",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_extracted_actual_name_of_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects and adds the product to cart from search results",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_add_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates the product in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_searched_for_partial_text_in_offers_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/BankingLogin.feature");
formatter.feature({
  "name": "Verify the Banking website MyAccounts Home page functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should be able to select and navigate to respective Account history screen in the banking website",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "the user enters a valid \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "the user selects account no \u003caccountNo\u003e from the drop down and clicks on Go",
  "keyword": "When "
});
formatter.step({
  "name": "the user should be navigate to the Account history screen for \u003caccountNo\u003e selected",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountNo"
      ]
    },
    {
      "cells": [
        "jsmith",
        "demo1234",
        "800003"
      ]
    }
  ],
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the \"https://demo.testfire.net/\" website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefiniton.the_user_is_on_the_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefiniton.clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to select and navigate to respective Account history screen in the banking website",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@valid"
    }
  ]
});
formatter.step({
  "name": "the user enters a valid jsmith and demo1234",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefiniton.the_user_enters_a_valid_jsmith_and_demo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects account no 800003 from the drop down and clicks on Go",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefiniton.the_user_selects_acoount_no(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be navigate to the Account history screen for 800003 selected",
  "keyword": "Then "
});
formatter.match({
  "location": "accountHistoryStepDefinition.the_user_should_be_logged_in_to_the_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountNo"
      ]
    },
    {
      "cells": [
        "jsmith",
        "3",
        "800003"
      ]
    }
  ],
  "tags": [
    {
      "name": "@invalid"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the \"https://demo.testfire.net/\" website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefiniton.the_user_is_on_the_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefiniton.clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to select and navigate to respective Account history screen in the banking website",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "name": "the user enters a valid jsmith and 3",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefiniton.the_user_enters_a_valid_jsmith_and_demo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects account no 800003 from the drop down and clicks on Go",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefiniton.the_user_selects_acoount_no(String)"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to select option by value \u0027800003\u0027 of object \u0027Object Repository/BankingHomePageObjects/selectDropDownAccount\u0027  using regular expression\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByValueKeyword.selectOptionByValue(SelectOptionByValueKeyword.groovy:99)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByValueKeyword.execute(SelectOptionByValueKeyword.groovy:71)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.selectOptionByValue(WebUiBuiltInKeywords.groovy:1168)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$selectOptionByValue$5.call(Unknown Source)\r\n\tat stepDefinition.LoginStepDefiniton.the_user_selects_acoount_no(LoginStepDefiniton.groovy:54)\r\n\tat ✽.the user selects account no 800003 from the drop down and clicks on Go(Include/features/BankingLogin.feature:10)\r\nCaused by: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027Object Repository/BankingHomePageObjects/selectDropDownAccount\u0027 located by \u0027//select[@id\u003d\u0027listAccounts\u0027]\u0027 not found\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1381)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByValueKeyword$_selectOptionByValue_closure1.doCall(SelectOptionByValueKeyword.groovy:86)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByValueKeyword$_selectOptionByValue_closure1.call(SelectOptionByValueKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByValueKeyword.selectOptionByValue(SelectOptionByValueKeyword.groovy:99)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByValueKeyword.execute(SelectOptionByValueKeyword.groovy:71)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.selectOptionByValue(WebUiBuiltInKeywords.groovy:1168)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$selectOptionByValue$5.call(Unknown Source)\r\n\tat stepDefinition.LoginStepDefiniton.the_user_selects_acoount_no(LoginStepDefiniton.groovy:54)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:70)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:52)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:105)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy:621)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:618)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:718)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner.call(Unknown Source)\r\n\tat CucumberTestRunner.run(CucumberTestRunner:3)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1700114159679.run(TempTestSuite1700114159679.groovy:36)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user should be navigate to the Account history screen for 800003 selected",
  "keyword": "Then "
});
formatter.match({
  "location": "accountHistoryStepDefinition.the_user_should_be_logged_in_to_the_website(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Include/features/SearchProduct.feature");
formatter.feature({
  "name": "Search and Place the orders for Products",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search Expereince for product search in both Home and Offers page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User is on Greenkart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches with text \"Tom\"",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_searched_with_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "extracts actual name of search product",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_extracted_actual_name_of_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for \"Tom\" partial text in Offers page",
  "keyword": "Then "
});
formatter.match({
  "location": "OffersPageStepDefinition.user_searched_for_partial_text_in_offers_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate product name in Offers page matches with Landing page",
  "keyword": "And "
});
formatter.match({
  "location": "OffersPageStepDefinition.validate_product_name_in_offers_page_matches_with_landing_page()"
});
formatter.result({
  "status": "passed"
});
});