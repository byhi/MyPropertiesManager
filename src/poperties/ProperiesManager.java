package poperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProperiesManager {
	public static Properties getPropertiesFromFile(File path) {
		InputStream inputStream;
		Properties props = null;
		try {
			inputStream = new FileInputStream(path);
			props = new Properties();			 
			props.load(inputStream);			
		} catch ( IOException e1) {
			e1.printStackTrace();
		}

		return null;
	}
}
