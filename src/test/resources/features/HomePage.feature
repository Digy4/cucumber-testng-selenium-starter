# Created by Lenovo at 10-09-2023
Feature: Digy4 dashboard homepage
  Scenario: The homepage should render standard information
    Given a user logs in and check for runs
    And does nothing
    Then Header tiles should not be zero

  Scenario: Viewing the Admin Panel
    Given a user logs in wants to visit the admin panel
    And clicks on the admin panel button
    Then  the user should be taken to

    Given a user has clicked on admin panel button
    And clicks on the project view button
    Then open the Projects page