Feature: User Deletion

  Scenario: Verify user Deletion
    Given the user launch the application
    When they log in to their account
    And click on the client-user link
    And select one particular record and click on edit icon
    And click on the delete button
    Then the deleted record should be verified