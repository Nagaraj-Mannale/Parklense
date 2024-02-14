Feature: Verify the Admin-Roles page functionalities

  Scenario: Verify admin-role Creation
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-roles link
    When they click on the new button
    And enter the admin-role title
    And click on the save button
    Then the created admin-role should be verified
  
