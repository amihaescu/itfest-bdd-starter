Feature: speeding

  You are driving a little too fast, and a police officer stops you.
  Write code to compute the result, encoded as an int value:
  0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
  If speed is between 61 and 80 inclusive, the result is 1.
  If speed is 81 or more, the result is 2.
  Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.


  Scenario: I am doing 60 and it's not my birthday
    Given I am cruising along at 60 miles per hour
    And It's not my birthday
    When the cops pull me over
    Then I get no fine

  Scenario: I am doing 65 and it's not my birthday
    Given I am cruising along at 65 miles per hour
    And It's not my birthday
    When the cops pull me over
    Then I get small fine

  Scenario: I am doing 65 and it's my birthday
    Given I am cruising along at 65 miles per hour
    And It's  my birthday
    When the cops pull me over
    Then I get no fine

  Scenario: I am doing 85 and it's not my birthday
    Given I am cruising along at 65 miles per hour
    And It's not my birthday
    When the cops pull me over
    Then I get big fine