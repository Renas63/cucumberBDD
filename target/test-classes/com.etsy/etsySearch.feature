Feature: Etsy Search Functionality
  Scenario: Validation of etsy search
    Given user navigates to "https://www.etsy.com/"
    When user search with "Hat"
    Then  user should see the title "Hat | Etsy"

  Scenario: Validation of etsy search
    Given user navigates to "https://www.etsy.com/"
    When user search with "Key"
    Then  user should see the title "Key | Etsy"

  Scenario: Validation of etsy search
    Given user navigates to "https://www.etsy.com/"
    When user search with "Pin"
    Then  user should see the title "Pin | Etsy"
