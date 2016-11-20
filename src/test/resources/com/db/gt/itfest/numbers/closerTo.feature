Feature: closer to

  Scenario: which number is closer to 10 between 8 and 13
    Given I have an numbers object with a=8 and b=13
    When I check to see which one is closer to 10
    Then the closer one should be 8

  Scenario: which number is closer to 10 between 13 and 8
    Given I have an numbers object with a=13 and b=8
    When I check to see which one is closer to 10
    Then the closer one should be 8

  Scenario: which number is closer to 10 between 13 and 7
    Given I have an numbers object with a=13 and b=7
    When I check to see which one is closer to 10
    Then the closer one should be 0
