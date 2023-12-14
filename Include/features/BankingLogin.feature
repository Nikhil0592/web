Feature: Verify the Banking website MyAccounts Home page functionality

  Background: 
    Given the user is on the "https://demo.testfire.net/" website
    And clicks on the Login button

  @sanity
  Scenario Outline: User should be able to select and navigate to respective Account history screen in the banking website
    Given the user enters a valid <username> and <password>
    When the user selects account no <accountNo> from the drop down and clicks on Go
    Then the user should be navigate to the Account history screen for <accountNo> selected

    @valid
    Examples: 
      | username | password | accountNo |
      | jsmith   | demo1234 |    800003 |

    @invalid
    Examples: 
      | username | password | accountNo |
      | jsmith   |        3 |    800003 |
