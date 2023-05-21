Feature: Buy Video Games from Amazon Egypt

  Scenario: Add Video Games to Cart and Checkout
    Given I am on the Amazon Egypt homepage
    When I login to Amazon Egypt
And I open the "All" menu from the left side
    And I select "Video Games" from the menu
    And I choose "All Video Games"
    And I add the filter "Free Shipping" and "New"
    And I sort products by price: high to low
    And I add all products below 15k EGP to cart
    And I proceed to checkout
    And I add the address and choose cash as payment method
    Then I verify that the total amount is correct with shipping fees