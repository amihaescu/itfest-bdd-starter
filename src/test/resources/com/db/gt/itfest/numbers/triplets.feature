Feature: triplets in an array

  Scenario: an array that does not contain triplets
    Given I have an numbers object with the values: 1,1,2,2,1
    When I check to see there are no triplets
    Then the result should be true

  Scenario: an array that does contain triplets
    Given I have an numbers object with the values: 1,1,2,2,2,1
    When I check to see there are no triplets
    Then the result should be false