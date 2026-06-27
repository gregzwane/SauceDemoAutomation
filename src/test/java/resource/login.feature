@regression
Feature: Log in using the provided credentials

  Scenario Outline: User login with the provided credentials
    Given the user has open the browser and capture the test url
    When user capture '<username>'
    And user capture '<password>'
    When user click on login button
    Then the user login successfully
    Examples:
      |username  |password|
    |     standard_user     |secret_sauce|

Scenario: Add Items to Cart:
  Given user has login successfully with the correct credentials
  And user select first item to add in the Cart
  And user select second item to add in the Card
  When the user select the Cart
  Then two item are in the Cart

  Scenario: View Cart and Verify Items
    Given the user is has added two item on Cart
    When user select the basket
    Then user verify the two item in the Cart

  Scenario Outline:  Checkout Process
    Given the user has added items on the cart
    And user try to proccess the Check out
    When Add checkout information name '<FirstName>' , Surname '<LastName>' and PostalCode '<PostalCode>'
    Then check proccess is successfully
    Examples:
      |  FirstName|LastName| PostalCode|
      |John        | Doe | 12345         |

    Scenario: Finish Checkout
      Given user has proccess all the check out details
      When user click on Finish
      Then user place the order successfully and verify it

    Scenario:  Logout
      Given user is done with the check out
      When user click logout button
      Then user is abler to logout successfully






