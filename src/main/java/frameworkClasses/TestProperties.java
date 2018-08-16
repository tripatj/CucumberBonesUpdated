package frameworkClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	private static Properties prop = new Properties();
	
	public static void loadDefaultProperty() {
		
		File file = new File(System.getProperty("user.dir") + "/src/test/java/UserDefaultProperty.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
			}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static String getPropertyValue(String propertyName) {		
		String value = null;
		
		if ( prop.getProperty(propertyName)!=null) {
			
			value = prop.getProperty(propertyName);
		}
		
	return value;
	}
}
