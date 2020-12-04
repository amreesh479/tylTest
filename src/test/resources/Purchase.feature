Feature: Purchase Items

  Background: User Login
    Given User navigates to HomePage
    Then company logo is displayed
    When user tries to login
    Then login is successful

  @test
  Scenario Outline: Purchase two items
    Given user filter product list
    And select cheapest product
    And select second costliest product
    Then cart has 2 products
    When user select cart
    Then cart is displayed
    When user select checkout
    Then checkout is displayed
    When user provides <firstName> <lastName> and <zip>
    And  select continue
    Then checkout overview is displayed
    When user select finish
    Then Order finish page is displayed

    Examples:
    | firstName | lastName | zip    |
    | Win       | Zo       | N1 3ED |



#    Additional Scenarios without any glue code
  @noRun
  Scenario: User has multiple options to sort products
    Given user sort product for name a2z
    Then product list is sorted for name a2z
    When user sort product for name z2a
    Then product list is sorted for name z2a
    When user sort product for price low2high
    Then product list is sorted for price low2high
    When user sort product for price high2low
    Then product list is sorted for price high2low

  Scenario: User can remove item from cart
    Given user filter product list
    And select cheapest product
    And select second costliest product
    Then cart has 2 products
    When user tries to remove a item from the cart
    Then item should be removed
    And product count of cart should reduce by 1

  Scenario: User can continue shopping after visiting cart
    Given user filter product list
    And select cheapest product
    And select second costliest product
    Then cart has 2 products
    When user select cart
    Then cart is displayed
    When user can continue shopping
    Then product list is displayed

  Scenario: User can cancel to navigate to cart from checkout
    Given user filter product list
    And select cheapest product
    And select second costliest product
    Then cart has 2 products
    When user select cart
    Then cart is displayed
    When user select checkout
    Then checkout is displayed
    When user opt to cancel
    Then product list is displayed


  Scenario: User can't proceed to checkout without providing firstname, lastname and zip
    Given user filter product list
    And select cheapest product
    And select second costliest product
    Then cart has 2 products
    When user select cart
    Then cart is displayed
    When user select checkout
    Then checkout is displayed
    When  select continue
    Then error message is displayed

  Scenario: User can access products from All Items
    Given user select all items
    Then product list is displayed

  Scenario: User can logout from the application
    Given user select all items
    Then product list is displayed
    When user logouts
    Then company logo is displayed







