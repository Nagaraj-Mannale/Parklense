Feature: Verify client End to End scenarios

 Scenario: Verify the  dashboard count
      
 Given open the browser enter the url
 When  login to the application
 And 	 get dashboard count
 And   go to the client page and create one client
 Then  verify the dashboard count
 And   logout from the application
 
 Scenario: Verify that created client is appears in dropdown of related features
  Given open the browser enter the url
  When  login to the application
  And   create a new client and get the name
  Then  Verify in User home, new and edit page
   And  Verify in Site home, new and edit page
   And  Verify in home, new and edit page
   And  Verify in Stalls home page
   And  Verify in Camera home, new and edit page
   And  Verify in Attribute value home, new and edit page
   And  Verify in Client-role home, new and edit page
   And  Verify in Camera home, new and edit page
   And  logout from the application 

