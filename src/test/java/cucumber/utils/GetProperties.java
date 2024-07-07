package cucumber.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.Properties;

public class GetProperties {
    public static String testManagementTool = System.getProperty("testManagementTool",propLoad("testManagementTool"));
    public static String testManagementUrl = System.getProperty("testManagement.url",propLoad("testManagement.url"));
    public static String testManagementTestKeys = System.getProperty("testManagement.testKeys",propLoad("testManagement.testKeys"));
    public static String clientId = System.getProperty("testManagement.clientId",propLoad("testManagement.clientId"));
    public static String clientSecret = System.getProperty("testManagement.clientSecret",propLoad("testManagement.clientSecret"));
    public static String featureFileDir = System.getProperty("featureFileDir", propLoad("featureFileDir"));
    public static String testResultdir = System.getProperty("testResultdir", propLoad("testResultdir"));
    public static String downloadFileFormat = System.getProperty("downloadFileFormat", propLoad("downloadFileFormat"));
    public static String testManagementToolInteraction = System.getProperty("testManagementToolInteraction",propLoad("testManagementToolInteraction"));

    private static String propLoad(String key){
        final Properties prop = new Properties();
        String value = null;
        try {
            final URI url = new GetProperties().getClass().getClassLoader().getResource("testmanagement.config.properties").toURI();
            final String path = url.getPath();
            final InputStream in = new FileInputStream(path);
            prop.load(in);
            value = prop.getProperty(key);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return value;
    }

}
