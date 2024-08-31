This project is an example of automation testing on the OrangeHRM website using Katalon Studio. The project encompasses two testing phases: functional testing and 
regression testing. 

1. Functional Testing:
  1. Login and Logout Testing with Data-Driven Testing (DDT):
     This tests the functionality and security of the login feature to ensure it meets expected standards. The scenarios tested include:
     Successful login
     -  Login with an incorrect username
     -  Login with an incorrect password
     -  Login with both incorrect username and password
     -  Login without entering a username
     -  Login without entering a password
     -  Login without entering both username and password
     -  Login with a case-sensitive username
     -  Login with a case-sensitive password.
  
  2. avigation Testing:
     This tests whether the navigation through each menu on the admin page functions as expected.
     
  3. CRUD Testing:
     This tests whether the Create, Read, Update, and Delete functionalities on the employee menu work correctly.
     
2. Regression Testing:
   In this phase, the three test cases mentioned above login and logout, navigation, and CRUD testing—are re-executed to ensure that no regressions or functional
   issues have been introduced following any changes or updates to the application.

