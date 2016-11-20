Feature: front to back

  Scenario: Change front to back
    Given I have the string: eodc
    When I change the front to back
    Then I expect the following string: code
