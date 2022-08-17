package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws IOException {
		
		String path=System.getProperty("user.dir")+"\\Config\\config.properties";
		FileInputStream fis=new FileInputStream(path);
		 pro=new Properties();
		pro.load(fis);
		
	}
	
	public String getBaseUrl() {
		return pro.getProperty("url");
	}
}
