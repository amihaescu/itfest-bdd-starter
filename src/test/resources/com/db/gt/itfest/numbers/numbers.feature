Feature: average

  Scenario: integer average
    Given I have an numbers object with the values: 1,2,3
    When I calculate the average
    Then I expect it to be 2

  Scenario: float average
    Given I have an numbers object with the values: 1,2,3,4
    When I calculate the average
    Then I expect it to be 2.5

  Scenario: array contains 9 among its first 4 elements
    Given I have an numbers object with the values: 1,2,9,3,4
    When I check if one of the first 4 elements in the array is a 9
    Then the result should be true

  Scenario: array contains 9 among its first elements
    Given I have an numbers object with the values: 1,2,9
    When I check if one of the first 4 elements in the array is a 9
    Then the result should be true

  Scenario: array does not contain 9 among its first 4 elements
    Given I have an numbers object with the values: 1,2,3,4,9,8
    When I check if one of the first 4 elements in the array is a 9
    Then the result should be false

  Scenario: array does not contain 9 among its first elements
    Given I have an numbers object with the values: 1,2,3
    When I check if one of the first 4 elements in the array is a 9
    Then the result should be false

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
