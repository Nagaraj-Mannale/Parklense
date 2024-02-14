Feature: Client Role Creation

  Scenario: Verify client-role Editing
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on client-roles link
    When they select a specific client-role and click on the edit button
    And do some modification on client-role
    And click on the save button
    Then the updated client-role should be verified
