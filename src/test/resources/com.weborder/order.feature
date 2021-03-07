Feature: WebOrder Page Food Order
  Scenario: Validation of Food Order for Office
    Given user is on webOrder home page
    Then  user selects the  "Office" option
    And user is on  the group order page
    Then user sends a invitees note "Test"
    And user sends invite list "Kushal@gmail.com" and "Priyanka@gmail.com"
    And user validates "View Group Order" text
    * user validates total participant is 1