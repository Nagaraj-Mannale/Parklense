Feature: Updating the Existing site

  Scenario: Verify the Updation Of site
    Given the user launch the application
    When they log in to their account
    When they click on the site link
    And select one particular site and click on edit icon
    Then the user on the edit site page
    When they update the site name
    And click on the save button
    Then verify if the site has been updated
