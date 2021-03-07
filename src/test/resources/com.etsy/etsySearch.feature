@search
Feature: Etsy Search Functionality

  @hat @tc1 @smoke @regression
  Scenario: Validation of etsy search
    Given user navigates to "https://www.etsy.com/"
    When user search with "Hat"
    Then  user should see the title "Hat | Etsy"


  @key  @tc2 @smoke @regression
  Scenario: Validation of etsy search
    Given user navigates to "https://www.etsy.com/"
    When user search with "Key"
    Then  user should see the title "Key | Etsy"

  @pin @tc3  @regression
  Scenario: Validation of etsy search
    Given user navigates to "https://www.etsy.com/"
    When user search with "Pin"
    Then  user should see the title "Pin | Etsy"
