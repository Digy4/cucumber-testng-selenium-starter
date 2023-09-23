# Created by Lenovo at 22-09-2023
Feature: Digy4 Projects

  Scenario: The project List should render standard information
    Given the user visit project list page
    And user has some projects created
    Then user should be able to view them on the list