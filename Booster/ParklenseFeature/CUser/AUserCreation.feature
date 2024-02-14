Feature: User Management

  Scenario: Verifing the new user creation
    Given the user launch the application
    When they log in to their account
    Then the user is on the dashboard home page
    When click on the client-user link
    And they click on the new button
    Then the user is on the client-user new page
    And they select client from the client dropdown
    And they enter name into the name text field
    And they enter user name into the user name text field
    And they enter user-email into the email text field
    And they enter mobile number into the mobile text field
    And they select role from the role dropdown
    And they select lot from the lot dropdown
    And they select Status from the client status dropdown
    And they enter password into the  password text field
    And they enter retype-password into the  retype-password text field
    And click on the save button
    Then the created client-User should be displayed on the client page
