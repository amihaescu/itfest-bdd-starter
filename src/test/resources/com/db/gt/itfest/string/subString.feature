Feature: String manipulation

  Scenario: String substring
    Given I have the string: asdasdadasa
    When I search for the chars between position 1 and 5
    Then I expect to get the following char sequence: s, d, a, s