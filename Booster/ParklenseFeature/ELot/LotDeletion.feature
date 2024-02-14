Feature: Verify the Lot page components

  Scenario: Verify Lot Deletion
    Given the user launch the application
    When they log in to their account
    When they click on the lot link
    When select one particular record and click on edit icon
    And click on the lot delete button
    Then the deleted record should be verified
    