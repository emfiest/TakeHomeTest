# TakeHomeTest

### Setup instructions that will need to be completed locally:
1. Setup was done on a Windows machine
2. Install Java jdk and add path for bin folder to the environment variables
https://www.oracle.com/java/technologies/downloads/
2. Install Eclipse IDE (comes with Maven)
https://www.eclipse.org/downloads/
3. Add cucumber plugin to Eclipse

### Additional setup notes:
1. Downloaded Selenium Server Grid/Binding for Java. This was added to the Maven project
https://www.selenium.dev/downloads/
2. Downloaded chrome driver and added it to the project
https://chromedriver.chromium.org/
3. Added Cucumber JVM dependency to pom.xaml
https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.9.0

### Instructions for running tests
1. Locate the Features folder (there are 3 tests)
2. Right click each and Run As > Cucumber Feature 
3. Console should contain output if the test passed or failed


### Some extra notes about my setup:
The tests that I wrote are for verifying the display of the login page, verifying a valid login, and verifying and invalid login. In order to run the test for verifying a valid login, the username and password need to be added in the test steps: 
	When I enter "" in the Email field
	And I enter "" in the Password field
I have not used Selenium before so I tried using xpath, cssSelector, and id to locate different elements.

### Extras that I would have liked to spend time on:
Generate a report that contains the results of the test run. 
In the test that verifies the display of the login page I would have liked to add some checks for screen elements like buttons, labels, checkboxes, and links.