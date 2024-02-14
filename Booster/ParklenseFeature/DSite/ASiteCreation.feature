Feature: Site Management

  Scenario: Verifing the new site creation
    Given the user launch the application
    When they log in to their account
    And they click on the site link
    Then the user on the site page
    When they click on the new button
    Then the user is on the site new page
    When they select client from the client dropdown
    And they enter site name into the site text field
    And they enter site title into the site title text field
    And click on the save button
    Then Verify for the created site
