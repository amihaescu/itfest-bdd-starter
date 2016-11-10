Feature: Foodie

  Scenario: I like pie
    Given I have a First Class object initialized with value:Pie
    When I call upper string method
    Then I get PIE

  Scenario: I like cHoCoLATE
    Given I have a First Class object initialized with value:cHoCoLATE
    When I call lower string method
    Then I get chocolate