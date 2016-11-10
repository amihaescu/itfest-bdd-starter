Feature: String manipulation

  Scenario: String substring
    Given I have the string: asdasdadasa
    When I search for the chars between position 1 and 5
    Then I expect to get the following char sequence: s, d, a, s


  Scenario: String within string
    Given I have the string: adasdasda
    When I search for the string sd
    Then I expect to find it

  Scenario: String within string
    Given I have the string: adasdasda
    When I search for the string xy
    Then I expect not to find it