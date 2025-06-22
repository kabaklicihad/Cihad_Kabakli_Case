# QA Engineer - Selenium Automation Task

This project automates a set of test scenarios for the Insider (https://useinsider.com/) website using Java and Selenium WebDriver. The goal is to verify the functionality of specific UI components, navigation paths, and job listing filters as described in the provided task document.

## Test Coverage

Based on the task instructions in the PDF, the test suite covers the following scenarios:

1. Verifies that the homepage (`https://useinsider.com/`) is opened successfully.
2. Navigates to **Company > Careers** and checks that the **Career** page is loaded with visible blocks (Locations, Teams, Life at Insider)
3. On the **Quality Assurance** careers page, clicks “See all QA jobs”, applies filters for:
   - Location: *Istanbul, Turkey*
   - Department: *Quality Assurance*
4. Verifies that all listed jobs contain:
   - Position: *Quality Assurance*
   - Department: *Quality Assurance*
   - Location: *Istanbul, Turkey*
5. Clicks on the **View Role** button and checks that it redirects to the Lever application form page

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