@smoke_test @XD-105 @XD-102
Feature: Smoke test

  @XD-104
  Scenario: Login as different users
    Given user logs in with following credentials
      | username | salesmanager101 |
      | password | UserUser123     |
    Then user navigates to "Fleet" and "Vehicles"
    And user verifies that "All Cars" page name is displayed

  @XD-113
  Scenario: Login as a driver
    Given user logs in as a driver
    And user verifies that "Quick Launchpad" page name is displayed