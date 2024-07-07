package cucumber.utils;

public class TestExecutionUploader {

    public static void main(String[] args) throws Exception {
        if (GetProperties.testManagementToolInteraction.equals("true")) {
            final TestManagmentInteraction jiraInteraction = new TestManagmentInteraction();
            jiraInteraction.importResults(GetProperties.clientId, GetProperties.clientSecret,
                    GetProperties.testManagementUrl, GetProperties.testResultdir);
        }
    }

}
