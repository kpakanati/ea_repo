package com.equifax.www;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	Properties prop;
	public ReadProperty() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("Config.properties");
		prop.load(fis);
	}
	public String getProperty(String propertyName) {
		return prop.getProperty(propertyName);
	}
	

}
