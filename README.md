# cucumber-testng-selenium-starter
Cucumber with TestNG and Selenium starter to use with DigyRunner

[Cucumber](https://cucumber.io/docs/installation/java/) with [TestNG](https://testng.org) and [Selenium](https://www.selenium.dev/) Integration with DigyRunner to be able to run against any Remote selenium grid and visualise in Digy Dashboard.


![Digy4 Logo](https://digy4.com/wp-content/uploads/2021/12/logo.png)

## Register at [Digy4](https://www.digy4.com)
- Register and get all the information required to be able to successfully run this demo test

## How to build and run using maven

### Clone the repository
- Clone the repository. Run `git clone https://github.com/Digy4/cucumber-testng-selenium-starter`

## Configurations
- Supply Hub URL for any remote/local selenium grid `digy4.hubUrl` in `src/test/resources/digy4.config.properties` file

## Run the tests
- Run `mvn clean verify`

## Explore the results in the Digy Dashboard
- Visit `https://release-saas-sprint-1.dkhmetqbwqyzu.amplifyapp.com/`

## How to build and run using Gradle

### Prerequisites
- Java version 9 and above is required for running with Gradle

### Clone the repository
- Clone the repository. Run `git clone https://github.com/Digy4/cucumber-testng-selenium-starter`

## Configurations
- Supply Hub URL for any remote/local selenium grid `digy4.hubUrl` in `src/test/resources/digy4.config.properties` file

## Run the build
- Run `gradle build`

## Run the tests
- Run `gradle digy4DemoTest`

## Explore the results in the Digy Dashboard
- Visit `https://release-saas-sprint-1.dkhmetqbwqyzu.amplifyapp.com/`
