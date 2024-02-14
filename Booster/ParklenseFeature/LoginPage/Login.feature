Feature: Login Page Testing by both positive and negative scenarios

Scenario: Successful Login
  Given the user launch the application
  When the user enters a valid email ID into the email ID field
  And the user enters a valid password into the password text field
  And clicks on the login button
  Then the user is on the dashboard home page

Scenario: Incorrect Email for Login
  Given the user launches the browser
  When the user enters an incorrect email ID into the email ID field
  And the user enters a valid password into the password text field
  And clicks on the login button
  Then the user is on sign-in page

Scenario: Incorrect Password for Login
  Given the user launches the browser
  When the user enters a valid email ID into the email ID field
  And the user enters an incorrect password into the password text field
  And clicks on the login button
  Then the user is on sign-in page

Scenario: Empty Fields for Login
  Given the user launches the browser
  When the user keeps the email ID field empty
  And the user keeps the password text field empty
  And clicks on the login button
  Then the user is on sign-in page
