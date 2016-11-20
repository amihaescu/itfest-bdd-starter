Feature: speeding

  Scenario: I am doing 60 and it's not my birthday
    Given I am crusing along at 60 miles per hour
    And It's not my birthday
    When the cops pull me over
    Then I get no fine