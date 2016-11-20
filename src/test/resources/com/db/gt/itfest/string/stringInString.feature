Feature: A string inside a string

  Scenario: String within string
    Given I have the string: adasdasda
    When I search for the string sd
    Then I expect to find it

  Scenario: String within string
    Given I have the string: adasdasda
    When I search for the string xy
    Then I expect not to find it