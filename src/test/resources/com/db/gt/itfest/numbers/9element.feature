Feature: 9 element

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
