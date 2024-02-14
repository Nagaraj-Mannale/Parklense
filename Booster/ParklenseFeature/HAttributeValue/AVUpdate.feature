Feature: Updating Attribute Value

  Scenario: Verify AttributeValue Editing
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on attributeValue link
    Then the user is on the AttributeValue home page
    When select one particular record and click on edit icon
    And enter the attribute value name
    And click on the save button
    Then the edited attribute should be verified
    
