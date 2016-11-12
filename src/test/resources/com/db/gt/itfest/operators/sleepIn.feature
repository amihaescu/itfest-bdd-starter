Feature: sleep in

  Scenario: Workday holiday
    Given It is Monday
    And I am on holiday
    When I check if I can sleep in late
    Then I see that I can


  Scenario: Weekend holiday
    Given It is Saturday
    And I am on holiday
    When I check if I can sleep in late
    Then I see that I can

  Scenario: No holiday weekend
    Given It is Saturday
    And I am not on holiday
    When I check if I can sleep in late
    Then I see that I can

  Scenario: Work day and no holiday
    Given It is Monday
    And I am not on holiday
    When I check if I can sleep in late
    Then I see that I cannot