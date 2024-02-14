Feature: Admin-Users Creation
  Scenario: Verify Admin-Users Creation
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-Users link
    When they click on the new button
    And enter the Admin-Users Name
    And enter the Admin-Users Mobile number
    And enter the Admin-Users Email-id
    And select the Admin-role status
    And enter the Admin-Users password
    And Renter the Admin-Users password
    And select the Admin-Users status
    And click on the save button
    Then the created Admin-Users should be verified
  
