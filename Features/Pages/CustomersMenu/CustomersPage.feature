Feature: user creates new customer


  Scenario Outline: user adds new customer
    Given user launched the browser
    When user opens homepage
    And user enters email as "<username>" and password as "<password>"
    And click on login
    Then user navigates to dropdown menu item "<dropdownMenuItem>"
    And user clicks on sub-dropdown menu item "<sub-dropdownMenuItem>"
    And user enters info for new customer "<rowNumber>"
    Then user verifies successful registration
    Then close the browser
    Examples:
      | username            | password | dropdownMenuItem | sub-dropdownMenuItem | rowNumber |
      | admin@yourstore.com | admin    | Customers        | Customers            | 2         |
      | admin@yourstore.com | admin    | Customers        | Customers            | 3         |

  Scenario Outline: user searches for customer using email, and/or name
    Given user launched the browser
    When user opens homepage
    And user enters email as "<username>" and password as "<password>"
    And click on login
    Then user navigates to dropdown menu item "<dropdownMenuItem>"
    And user clicks on sub-dropdown menu item "<sub-dropdownMenuItem>"
    Then user enters search parameters for "<name>"

      Examples:
        | username            | password | dropdownMenuItem | sub-dropdownMenuItem | name |
        | admin@yourstore.com | admin    | Customers        | Customers            | sample |