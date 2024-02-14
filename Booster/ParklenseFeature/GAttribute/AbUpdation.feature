 Feature: Updating Attribute 

 Scenario: Verify Attribute updation
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    When select one particular record and click on edit icon
    And modify the Attribute name
    And click on the save button
    Then the Updated attribute should be verified
    