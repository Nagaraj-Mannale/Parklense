Feature: Camera creation

  Scenario: Verify the Camera Creation
    Given the user launches the application
    When they log in to their account
    When they click on the camera link
    When they click on the camera new button
    And they select the client
    And they select the site
    And they select the lot 
    And they enter the camera name
    And they select the stalls
    And they Enter the camera url
    And they select the lots status
    And click on the save button
    Then the created Camera should be verified
    