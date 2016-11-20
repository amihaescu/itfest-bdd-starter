Feature: Front three
  Scenario: Front three long string
    Given I have the string: Java
    When I call the front three method
    Then I expect the following string: JavJavJav

  Scenario: Front three short string
    Given I have the string: ab
    When I call the front three method
    Then I expect the following string: ababab
