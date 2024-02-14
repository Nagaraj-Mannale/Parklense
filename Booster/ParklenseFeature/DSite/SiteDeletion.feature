Feature: site Deletion

  Scenario: Verify site Deletion
    Given the user launch the application
    When they log in to their account
    When they click on the site link
    When select one particular site and click on edit icon
    And click on the delete button
    Then the deleted site record should be verified