package utils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertiesFilePath = ".//src//test//resources//digy4.config.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertiesFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found");
		}
	}
	public String geturl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url is missing in the Fieldname.properties file");
	}
	public String getUsername() {
		String Username = properties.getProperty("Username");
		if (Username != null)
			return Username;
		else
			throw new RuntimeException("Username is missing in the Fieldname.properties file");
	}
	public String getPassword() {
		String Password = properties.getProperty("Password");
		if (Password != null)
			return Password;
		else
			throw new RuntimeException("Password is missing in the Fieldname.properties file");
	}
	public String getnewurl() {
		String newurl = properties.getProperty("newurl");
		if (newurl != null)
			return newurl;
		else
			throw new RuntimeException("url is missing in the Fieldname.properties file");
	}
	public String getemail() {
		String email = properties.getProperty("email");
		if (email != null)
			return email;
		else
			throw new RuntimeException("Username is missing in the Fieldname.properties file");
	}
	public String getpassword1() {
		String password1 = properties.getProperty("password1");
		if (password1 != null)
			return password1;
		else
			throw new RuntimeException("Password is missing in the Fieldname.properties file");
	}
	public String getperson() {
		String person = properties.getProperty("person");
		if (person != null)
			return person;
		else
			throw new RuntimeException("Password is missing in the Fieldname.properties file");
	}
	public String getrole() {
		String role = properties.getProperty("role");
		if (role != null)
			return role;
		else
			throw new RuntimeException("Password is missing in the Fieldname.properties file");
	}
	public String gettelephone() {
		String telephone= properties.getProperty("telephone");
		if (telephone != null)
			return telephone;
		else
			throw new RuntimeException("Password is missing in the Fieldname.properties file");
	}
	public String getemail1() {
		String email1= properties.getProperty("email1");
		if (email1 != null)
			return email1;
		else
			throw new RuntimeException("Password is missing in the Fieldname.properties file");
	}
	public String getaddress() {
		String address= properties.getProperty("address");
		if (address != null)
			return address;
		else
			throw new RuntimeException("Password is missing in the Fieldname.properties file");
	}
	
}
