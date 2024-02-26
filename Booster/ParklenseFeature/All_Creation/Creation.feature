Feature: Verify All Creation

Scenario: Verify the Creation of a Client
  Given the user launches the application
  When they log in to their account
  And get the dashboard count
  And go to the client page and create one client
  Then verify the dashboard count
  And get one recently created client ID
  Then verify in User home, New and Edit page
  And verify in Site home, New and Edit page
  And verify in Lot home and New page
  And verify in Stalls home page
  And verify in Camera home and New page
  And verify in Attribute value home, New and Edit page
  And verify in Client-role home, New and Edit page
  And logout from the application

Scenario: Verify Site and Lot Creation
  When go to the site
  And create one site with a known client
  Then verify the created site by applying the client filter
  When go to the lot page and create one new lot using the recently created site
  Then verify in the lot home page by applying Client and site filter
  When go to the camera page and create one camera
  Then verify in the camera home page

Scenario: Create a New User
  When go to the User page
  And create one new user using the recently created site and lot
  Then verify in the user home page by applying the client filter
