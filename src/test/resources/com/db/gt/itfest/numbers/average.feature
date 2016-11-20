Feature: average

  Scenario: integer average
    Given I have an numbers object with the values: 1,2,3
    When I calculate the average
    Then I expect it to be 2

  Scenario: float average
    Given I have an numbers object with the values: 1,2,3,4
    When I calculate the average
    Then I expect it to be 2.5