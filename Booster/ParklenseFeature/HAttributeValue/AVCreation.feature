Feature: Attribute value creation

  Scenario: Verify AttributeValue Creation
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on attributeValue link
    Then the user is on the AttributeValue home page
    When they click on the new button
    And select the attribute from drop-down
    And enter the attribute value name
    And select the client from drop down
    And select the attributeValue status
    And click on the save button
    Then the created attribute value should be verified
