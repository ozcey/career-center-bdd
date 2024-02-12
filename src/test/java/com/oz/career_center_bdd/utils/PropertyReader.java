package com.oz.career_center_bdd.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PropertyReader {
	
	public static Properties readProperties() {
		String filePath = "src/test/resources/test.properties";
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("Cannot read properties " + e.getMessage());
		}
		return properties;
	}

}
