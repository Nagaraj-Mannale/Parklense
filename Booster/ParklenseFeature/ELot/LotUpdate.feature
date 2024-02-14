Feature: Verify the Lot page components

  Scenario: Verify Lot Editing
    Given the user launch the application
    When they log in to their account
    When they click on the lot link
    When select one particular record and click on edit icon
    And modify the lot name
    And they enter the all coordinates
    And they upload the overlay
    And click on the save button
    Then the edited Lot should be verified
  