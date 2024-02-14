Feature: AttributeValue Deletion

  Scenario: Verify AttributeValue Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on attributeValue link
    Then the user is on the AttributeValue home page
    When select one particular record and click on edit icon
    And click on the delete button
    Then the deleted record should be verified
