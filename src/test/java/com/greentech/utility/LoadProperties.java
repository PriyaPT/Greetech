package com.greentech.utility;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.testng.annotations.Test;

@Test
public class LoadProperties {
	public static Map <String, String> propertyData;
	
	public Map<String,String> readProperty(){
		Properties property = new Properties();
		propertyData = new HashMap<String, String>();
		try {
			FileInputStream inputFile = new FileInputStream("./Resources/Data/environment.properties");
			property.load(inputFile);
			propertyData.put("appUrl", property.getProperty("appUrl"));
			
			Enumeration<?> ele = property.propertyNames();
			
			while(ele.hasMoreElements()) {
				String key = (String) ele.nextElement();				
				propertyData.put(key,property.getProperty(key));
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propertyData;
	}
	/*
	public static void main(String[] args) {
		LoadProperties lp = new LoadProperties();
		Map<String,String> propertyData = lp.readProperty();
		System.out.println(propertyData);
	}*/
}
