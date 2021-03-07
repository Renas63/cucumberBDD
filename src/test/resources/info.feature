# starting with FEATURE IS A MUST BUT THE LAST DOESNT HAVE TO FOLLOW THE ORDER
Feature: Print info
  Scenario: Validate information
    And  the user print firstname
    * the user print lastname
    * the user should see the fullname
    And the user print the  city
