Feature: Camera Editing

  Scenario: Verify Camera Editing
    Given the user launches the application
    When they log in to their account
    When they click on the camera link
    When select one particular record and click on edit icon
    And modify the camera name
    And click on the save button
    Then the updated camera should be verified
    