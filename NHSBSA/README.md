
This is a sample implementation of functional test using Cucumber and Selenium framework.

## Framework used:
* Cucumber
* Junit
* Java
* Selenium

## Running tests:
Test will run with Chrome set as default browser
To run test using firefox browser change browserName to Firefox on DriveHook class
## Running using maven target in terminal:

* To run in chrome use this target(default browser):  mvn clean verify

* To run all test in command line use - mvn clean test -Dcucumber.options="--tags @test"
* All possible profiles are listed under pom.xml.
