
Feature: users can add items to the cart and remove un-wanted item
         then complete placing successful order.

  @category
  Scenario: User check all listed categories have items
    When User Check phones category
    Then User find listed phones
    When User Check laptops category
    Then User find listed laptops
    When User Check monitors category
    Then User find listed monitors


  Scenario: User place a successful purchase
    When  User add items to the cart
    Then  User delete item from cart
    When  User place an order
    And   User fill mandatory fields
    And   User click on purchase button
    Then  Checkout done and successful msg will be displayed



