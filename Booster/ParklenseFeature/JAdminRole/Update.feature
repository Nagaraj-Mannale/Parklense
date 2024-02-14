Feature: Verify the Admin-Roles page functionalities

  Scenario: Verify admin-role Editing
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-roles link
    When they select a specific admin-role and click on the edit button
    And enter the admin-role title
    And click on the save button
    Then the edited role should be verified
   
