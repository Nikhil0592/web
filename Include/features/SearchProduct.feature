Feature: Search and Place the orders for Products

@sanity
  Scenario: Search Expereince for product search in both Home and Offers page
    Given User is on Greenkart Landing page
    When User searches with text "Tom"
    And extracts actual name of search product
    Then User searched for "Tom" partial text in Offers page
    And validate product name in Offers page matches with Landing page
