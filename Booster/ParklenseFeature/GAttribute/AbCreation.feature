Feature: Verify the Attribute page components

  Scenario: Verify Attribute Creation
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    Then the user is on the Attribute home page
    When they click on the new button
    Then user is on the Attribute new page
    When enter the attribute name
    And Verify the description text field
    And select the attribute status
    And click on the save button
    Then the created attribute should be verified
