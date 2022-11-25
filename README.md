# Assurity Assignment 

## Name : API Test Automation

### Tools/tech used : 
Selenium web driver, Java, Rest Assured, Karate, Cucumber, Maven

### Description : 
Written this framework to validate following criteria of the given API response.

API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

### Acceptance Criteria:

•	Name = "Carbon credits"

•	CanRelist = true

•	The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"


##### I have written same test using two technics.
1.	Using Rest Assured library with Java.

  > *AssurityTest\src\test\java\apiTestsKarate\ValidateResponse.feature*

2.	As a BDD test, using Karate and Rest Assured libraries.

  > *AssurityTest\src\test\java\apiTestsKarate\ValidateResponse.java*

### How to install the solution:

1.	You can download from GIT repository – https://github.com/kaveendralk/Assurity
2.	Import the project in to your IDE. You should have Cucumber and TestNG installed.
3.	MAVEN use for build the project.
4.	pom.xml includes  all the dependencies required to build with MAVEN.

### How to run tests:

#### •To run 1st solution, 

Select ValidateResponseRunner.java  > Right click > Run as Junit Test
OR
Select ValidateResponse.feature > Right click > Run as Cucumber feature

> Test report can be seen in - *target\karate-reports\karate-summary.html*

#### •To run 2nd solution, 

Select ValidateResponse.java > Right click > Run as TestNG Test

> Test report can be seen in - *test-output\Default suite\Default test.html*





