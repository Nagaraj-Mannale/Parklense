Feature: Verify the Admin-Users page functionalities

  Scenario: Verify Admin-Users Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-Users link
    When select one particular record and click on edit icon
    And click on the delete button
    Then the deleted record should be verified
   
