Feature: one to three 'e'

  Scenario: String contains between 1 and 3 chars 'e'
    Given I have the string: Hello
    When I check if it contains between 1 and 3 'e' chars.
    Then I expect the result to be: true

  Scenario: String does not contain between 1 and 3 chars 'e'
    Given I have the string: Heelele
    When I check if it contains between 1 and 3 'e' chars.
    Then I expect the result to be: false
