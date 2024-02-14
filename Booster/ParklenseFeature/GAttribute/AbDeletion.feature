Feature: Attribute Deletion

 Scenario: Verify Attribute Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    When select one particular record and click on edit icon
    And click on the attribute delete button
    Then the deleted record should be verified
    