package Framework.utils;
public class EnvUtils {
    // Define URLs for different environments
    public static final String DEV_URL = "";
    public static final String PROD_URL = "https://dashboard.digy4.com/";
    public static final String STAGING_URL = "https://dashboard-test.digy4.com/";

    // Define credentials for different users
    public static final String ADMIN_USERNAME = "aragavanuseast2";
    public static final String ADMIN_PASSWORD = "Digy4101!";
    public static final String USER_USERNAME = "aragavanuseast2";
    public static final String USER_PASSWORD = "Digy4101!";


    // get environment-specific values
    public static String getUrlForEnvironment(String environmentType) {
        switch (environmentType) {
            case "DEV":
                return DEV_URL;
            case "STAGING":
                return STAGING_URL;
            case "PROD":
                return PROD_URL;
            default:
                throw new IllegalArgumentException("Unsupported environment type");
        }
    }

    public static String getUsernameForRole(String role) {
        switch (role) {
            case "ADMIN":
                return ADMIN_USERNAME;
            case "USER":
                return USER_USERNAME;
            default:
                throw new IllegalArgumentException("Unsupported user role");
        }
    }

    public static String getPasswordForRole(String role) {
        switch (role) {
            case "ADMIN":
                return ADMIN_PASSWORD;
            case "USER":
                return USER_PASSWORD;
            default:
                throw new IllegalArgumentException("Unsupported user role");
        }
    }
}
