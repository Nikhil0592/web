Feature: Search and Place orders for Products

@sanity
Scenario: Add to Cart Experience for product in Home page
    Given User is on Greenkart Landing page
    When User searches with text "Cauliflower"
    And extracts actual name of search product
    And User selects and adds the product to cart from search results
    Then User validates the product in the cart