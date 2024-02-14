Feature: Camera Deletion

  Scenario: Verify Camera Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the camera link
    When select one particular record and click on edit icon
    And click on the delete camera button
    Then the deleted record should be verified
 