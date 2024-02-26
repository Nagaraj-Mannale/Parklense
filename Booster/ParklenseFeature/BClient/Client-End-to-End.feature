Feature: Verify client End to End scenarios

Scenario: Verify the dashboard count

  Given the user launches the application
  When they log in to their account
  And get the dashboard count
  And go to the client page and create one client
  Then verify the dashboard count

Scenario: Verify that the created client appears in the dropdown of related features
  Given the user launches the application
  When they log in to their account
  And get one recently created client ID
  Then verify in User home, New and Edit page
  And verify in Site home, New and Edit page
  And verify in Lot home and New page
  And verify in Stalls home page
  And verify in Camera home and New page
  And verify in Attribute value home, New and Edit page
  And verify in Client-role home, New and Edit page
  And logout from the application 


