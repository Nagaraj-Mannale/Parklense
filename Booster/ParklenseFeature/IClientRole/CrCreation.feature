Feature: Client Role Creation

  Scenario: Verify client-role Creation
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on client-roles link
    Then the user is on the Client-role home page
    When they click on the new button
    And enter the client-role title
    And in the clientRoleNew page select the client from client drop down
    And select the client-role status
    And click on the save button
    Then the created client-role should be verified