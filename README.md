# QA Engineer - Selenium Automation Task

This project automates a set of test scenarios using Java and Selenium WebDriver. The goal is to verify the functionality of specific UI components, navigation paths, and job listing filters as described in the provided task document.

## Technologies Used

- Java 11+
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

## Prerequisites

Before running the project, make sure the following are installed and properly configured on your machine:

- **Java JDK 11 or later**  
  Ensure `JAVA_HOME` is set and `java -version` works in your terminal.

- **Maven 3.6 or later**  
  Used to manage dependencies and execute tests.

- **IntelliJ IDEA (or any Java IDE)**  
  Recommended for editing, building, and running the tests easily.

- **Google Chrome and Firefox Browser**  
  The tests are written for Chrome and Firefox.

- **ChromeDriver/GeckoDriver**  
  Ensure that [ChromeDriver] and [GeckoDriver] is installed and its version matches your installed browser.  
  Add it to your system `PATH` or set it explicitly in your WebDriver configuration.


## How to Run the Tests

### Using IntelliJ IDEA
1. Open the project in IntelliJ
2. Open WebTest.java file
3. Right click and Run Java

### Using Command Line (Maven)
mvn clean test

## Requirements Checklist
 - Java + Selenium used
 - No BDD framework (e.g., Cucumber, Codeception)
 - Follows the Page Object Model (POM) structure
 - Optimized XPath/CSS selectors
 - Uses assertions for validation
 - Clean and readable code structure