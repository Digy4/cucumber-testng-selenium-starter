package cucumber;


import cucumber.utils.GetProperties;
import cucumber.utils.TestManagmentInteraction;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

//
// Copyright (c) 2021 Digy4 Inc. and its affiliates. All rights reserved.
// Unauthorized copying of this file, via any medium is strictly prohibited
// Proprietary and confidential
// Any illegal or unauthorised usage or violations will result in immediate legal action.
//
@CucumberOptions(
		monochrome = true,
		//features = {"src/test/resources/features/basic","src/test/resources/features/volume"},
		//features = {"src/test/resources/features/GoFirstFailed","src/test/resources/features/GoFirst"},
		features = {"src/test/resources/features/sample"},
		glue = {"logic","framework","com.digy4.java.cucumber"},
		plugin = {"pretty","json:target/cucumber/report.json", "html:target/cucumber/report.html",
				  
				  "com.digy4.java.cucumber.Digy4CucumberSupport"}
		//tags = ("@Android")
		)
public class DigyTestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeClass(
			alwaysRun = true
	)
	public void setUpClass(ITestContext context) {
		if (GetProperties.testManagementToolInteraction.equals("true")) {
			final TestManagmentInteraction jiraInteraction = new TestManagmentInteraction();
			try {
				jiraInteraction.exportTests(GetProperties.clientId, GetProperties.clientSecret,
						GetProperties.testManagementUrl,
						GetProperties.testManagementTestKeys, GetProperties.featureFileDir);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		super.setUpClass(context);
	}

}

