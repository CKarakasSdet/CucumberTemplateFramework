
Feature: OrangeHRM Login
  Scenario: Logo presence on the home page
    Given I launch browser
    When I open orangeHRM homepage
    Then I verify that the logo is present on the homepage
    Then I close the browser