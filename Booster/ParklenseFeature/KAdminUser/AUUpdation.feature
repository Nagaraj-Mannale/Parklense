Feature: Verify the Admin-Users page functionalities

  Scenario: Verify Admin-Users Editing
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-Users link
    When select one particular record and click on edit icon
    And modify the Admin-user details
    And click on the save button
    Then the edited Admin-Users should be verified
    
