Feature: Login

  Scenario: Successful login with valid credentials
    Given user launched the browser
    When user opens homepage
    And user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user clicks on log out link
    Then page title should be "Your store. Login"
    Then close the browser


  Scenario Outline: Login with data driven tests
    Given user launched the browser
    When user opens homepage
    And user enters email as "<username>" and password as "<password>"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user clicks on log out link
    Then page title should be "Your store. Login"
    Then close the browser

    Examples:
      | username            | password |
      | admin@yourstore.com | admin    |


