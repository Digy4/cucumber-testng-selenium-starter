# cucumber-testng-selenium-starter
Cucumber with TestNG and Selenium starter to use with DigyRunner

[Cucumber](https://cucumber.io/docs/installation/java/) with [TestNG](https://testng.org) and [Selenium](https://www.selenium.dev/) Integration with DigyRunner to be able to run against any Remote selenium grid and visualise in Digy Dashboard.


![Digy4 Logo](https://digy4.com/wp-content/uploads/2021/12/logo.png)

## Register at [Digy4](https://dashboard.digy4.com)
- Register and get all the information required to be able to successfully run this demo test

## How to build and run using maven
- How to install maven https://maven.apache.org/install.html

### Clone the repository
### Read on more detailed steps from Digy4 online help - https://help.digy4.com/docs/digy-dashboard/digyrunner-integration/selenium-cucumber/
- Try Digy4 Pre-Integrated StarterKit
Have you created an account with DigyDashboard? Please click https://dashboard.digy4.com to create one
- Login to your account and click on Admin Panel -> Projects -> Add Project to the bottom left section of the dashboard
- Add a Project name that (eg: Demo) and other details and submit it
- Click Profile under user icon on the top right section of the dashboard
- Under Credentials section, copy Client ID and Client Secret and have it somewhere safe
- Clone the repository. Run `git clone https://github.com/Digy4/cucumber-testng-selenium-starter`
- `cd cucumber-testng-selenium-starter`
- For -Ddigy4.projectName=, use the project name you have created above (eg: Demo)
- For digy4.client_id use the client ID and digy4.client_secret, use the client secret from above
- `mvn clean install -Ddigy4.framework=cucumber -Ddigy4.teamName=Avengers -Ddigy4.projectName=Demo -Ddigy4.testType=WEB -Ddigy4.moduleName=LocalBrowser -Ddigy4.suiteName=integration -Ddigy4.threads=2 -Ddigy4.browser=chrome  -Ddigy4.cloudFarm=CUSTOM -Ddigy4.localBrowser=chrome -Ddigy4.client_id= -Ddigy4.client_secret=`
- Once this has completed, you can see the results in the DigyDashboard https://dashboard.digy4.com

## Configurations
- Supply Hub URL for any remote/local selenium grid `digy4.hubUrl` in `src/test/resources/digy4.config.properties` file

## Run the tests
- Run `mvn clean install -Ddigy4.framework=cucumber -Ddigy4.teamName=Avengers -Ddigy4.projectName=Demo -Ddigy4.testType=WEB -Ddigy4.moduleName=LocalBrowser -Ddigy4.suiteName=integration -Ddigy4.threads=2 -Ddigy4.browser=chrome  -Ddigy4.cloudFarm=CUSTOM -Ddigy4.localBrowser=chrome -Ddigy4.client_id= -Ddigy4.client_secret=`

## Explore the results in the Digy Dashboard
- Visit `https://dashboard.digy4.com/`