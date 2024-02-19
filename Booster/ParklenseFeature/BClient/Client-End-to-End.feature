Feature: Verify client End to End scenarios

Scenario: Verify the dashboard count

  Given the user launch the application
  When they log in to their account
  And get the dashboard count
  And go to the client page and create one client
  Then verify the dashboard count

#Scenario: Verify that the created client appears in the dropdown of related features

  Given the user launch the application
  When they log in to their account
  And Get one recently created client	id
  Then Verify in User home, New and Edit page
  And Verify in Site home, New and Edit page
  And Verify in home, New and Edit page
  And Verify in Stalls home page
  And Verify in Camera home, New and Edit page
  And Verify in Attribute value home, New and Edit page
  And Verify in Client-role home, New and Edit page
  And Verify in Camera home, New and Edit page
  And logout from the application 


