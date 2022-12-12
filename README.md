# TakeHomeTest

### Setup instructions that will need to be completed locally:
* Setup was done on a Windows machine.
* Install Java jdk and add path for bin folder to the environment variables.
https://www.oracle.com/java/technologies/downloads/
* Install Eclipse IDE.
https://www.eclipse.org/downloads/

### Additional setup notes:
* Downloaded Selenium Server Grid/Binding for Java. This was added to the Maven project.
https://www.selenium.dev/downloads/
* Downloaded chrome driver and added it to the project. 
https://chromedriver.chromium.org/
* Added Cucumber dependency to pom.xaml. 
https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.9.0

### Instructions for running tests:
1. Launch Eclipse and open the project 
2. Locate the Features folder (there are 3 tests)
3. Right click each and Run As > Cucumber Feature 
4. The Eclipse console should contain output if the test passed or failed  
"1 Scenarios (1 passed)"  

### Some extra notes about my setup:
The tests that I wrote are for verifying the display of the login page, verifying a valid login, and verifying and invalid login. I have not used Selenium before so I tried using xpath, cssSelector, and id to locate different elements. In order to run the test for verifying a valid login, the username and password need to be added in the test steps:  

When I enter "" in the Email field  
And I enter "" in the Password field  

### Extras that I would have liked to spend time on:
* Add tests that verify the display of the login page (screen elements like buttons, labels, checkboxes, and links).
* Add test for the error message that you see when there is a failed login attempt. 
* Generate a report that contains the results of the test run. 
