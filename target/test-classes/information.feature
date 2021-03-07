Feature:Print personal information
#In cucumber we have only 3 annotations for the steps which are GIVEN, WHEN, THEN
  Scenario: print info
    Given the user print firstname
    When  the user print lastname
    Then the user should see fullname
    And the user print city
    And the user print state
    * the user print age
    But the user should see the school name