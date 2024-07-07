package cucumber.utils;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.apache.commons.codec.binary.Base64InputStream;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class TestManagmentInteraction {

    public void exportTests(String clientId, String clientSecret, String baseUrl, String keys,
                            String featureFileDir)  throws Exception {
      final String url = baseUrl + "/digy4-api/test-management/download/cucumber?keys=" + keys;
      downloadUsingStream(url, clientId, clientSecret, featureFileDir);
    }

    public void importResults(String clientId, String clientSecret, String baseUrl,
                              String testResultdir) throws Exception {
        final String uploadFiledir = System.getProperty("user.dir")+"/"+testResultdir;
        final org.json.simple.parser.JSONParser parser = new JSONParser();
        final Object jsonBody = parser.parse(new FileReader(uploadFiledir));
        final JSONArray obj = (org.json.simple.JSONArray) jsonBody;
        final String json = obj.toString();
        try {
            final Response response = RestAssured.given().config(RestAssuredConfig.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames()))
                    .relaxedHTTPSValidation().contentType("application/json")
                    .header("client_id", clientId)
                    .header("client_secret", clientSecret)
                    .body(json).expect().statusCode(200)
                    .when()
                    .post(baseUrl + "/digy4-api/test-management/upload/result/cucumber").then().extract().response();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void downloadUsingStream(String urlStr, String clientId, String clientSecret, String file) throws Exception {
        final String currentDir = System.getProperty("user.dir");
        final String fileFormat = GetProperties.downloadFileFormat;
        final String filePath = currentDir + "/" + file;
        createFoldersIfRequired(filePath);
        final String featureFile = constructFileName(fileFormat, filePath);

        final URL url = new URL(urlStr);
        final URLConnection urlConnection = url.openConnection();
        urlConnection.setRequestProperty("client_id", clientId);
        urlConnection.setRequestProperty("client_secret", clientSecret);

        final InputStream inputStream = urlConnection.getInputStream();
        final Base64InputStream base64InputStream = new Base64InputStream(inputStream);
        final OutputStream outputStream = new FileOutputStream(featureFile);

        byte[] b = new byte[2048];
        int length;
        while ((length = base64InputStream.read(b)) != -1) {
            outputStream.write(b, 0, length);
        }

        base64InputStream.close();
        inputStream.close();
        outputStream.close();

        if(fileFormat.equals("zip")){
            UnzipFile unzipFile = new UnzipFile();
            unzipFile.unzipFunction(filePath,featureFile);
        }
    }

    private static String constructFileName(String fileFormat, String filePath) {
        if (fileFormat.equals("zip")) {
            return filePath + "/" + "feature.zip";
        }
        return filePath + "/" + "test.feature";
    }

    private static void createFoldersIfRequired(String path) {
        final File folder = new File(path);
        folder.mkdirs();
    }

}
