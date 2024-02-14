Feature: Client Role Deletion

  Scenario: Verify client-role Deletion
  
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on client-roles link
    When they select a specific client-role and click on the edit button
    And click on the delete button
    Then the deleted client-role should be verified
    