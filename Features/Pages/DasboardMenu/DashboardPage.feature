Feature: user can navigate to pages through left navigation tree menu

  Scenario Outline: user navigates to pages through navigation tree menu
    Given user launched the browser
    When user opens homepage
    And user enters email as <email> and password as <password>
    And click on login
    Then user navigates to dropdown menu item <dropdownMenuItem>
    And user clicks on sub-dropdown menu item <sub-dropdownMenuItem>
    Then page title should be <pageTitle>
    Then close the browser
    Examples:
      | email               | password | dropdownMenuItem | sub-dropdownMenuItem | pageTitle   |
      | admin@yourstore.com | admin    | Customers        | Customers        | "pageTitle" |