Feature: Admin-Role deletion

  Scenario: Verify admin-role Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-roles link
    When they select a specific admin-role and click on the edit button
    And click on the delete button
    Then the deleted admin-role should be verified
