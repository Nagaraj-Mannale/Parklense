Feature: Verify the Lot creation

  Scenario: Verify Lot Creation
    Given the user launch the application
    When they log in to their account
    And they click on the lot link
    And they click on the new button
    And they select the client
    And they select the site
    And they enter the lot name
    And they enter the lot title
    And they enter the parking duration
    And they select the lots location
    And they select the lots status
    And click on the save button
    Then the created lot should be verified
    