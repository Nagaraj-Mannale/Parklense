Feature: Verify the New-Client Creation

  Scenario: Verify Client Creation
    Given the user launches the application
    When they log in to their account
    When they click on the Client link
    When they click on the new button
    Then the user on the new client page
    And they enter  Name into the client name text field
    And they enter mobile number into the mobile number text field
    And they enter email into the email text field
    And they enter client adress into the address text field
    And they select Country from the country dropdown
    And they select State from the state dropdown
    And they select City from the city dropdown
    And they select client type from the client type dropdown
    And they select Status from the client status dropdown
    And they select the client start date and end date
    And click on the save button
    Then the created client should be displayed on the client page
