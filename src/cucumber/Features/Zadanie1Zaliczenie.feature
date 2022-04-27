Feature: Create new address

  Scenario Outline: Filling in the new address form fields

    Given user is logged in to his account
    When user clicks the "addresses" button
    When user clicks the "Create new address" button to add a new address
    When user fills form with data "<alias>", "<address>", "<city>", "<postal code>", "<country>", "<phone>"
    And on the same page, the user clicks the "Save" button to add a new address
    Then the address of the user will be added

    Examples:
      |alias    |address|city |postal code|country|phone  |
      |pseudonim|Rynek  |Nysa |48-300     |United Kingdom |987654321|

