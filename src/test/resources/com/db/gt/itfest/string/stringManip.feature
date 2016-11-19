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

  Scenario: Change front to back
    Given I have the string: eodc
    When I change the front to back
    Then I expect the following string: code

  Scenario: Front three long string
    Given I have the string: Java
    When I call the front three method
    Then I expect the following string: JavJavJav

  Scenario: Front three short string
    Given I have the string: ab
    When I call the front three method
    Then I expect the following string: ababab

  Scenario: String contains between 1 and 3 chars 'e'
    Given I have the string: Hello
    When I check if it contains between 1 and 3 'e' chars.
    Then I expect the result to be: true

  Scenario: String does not contain between 1 and 3 chars 'e'
    Given I have the string: Heelele
    When I check if it contains between 1 and 3 'e' chars.
    Then I expect the result to be: false
