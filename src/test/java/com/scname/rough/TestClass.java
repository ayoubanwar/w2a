package com.scname.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestClass {

	public static void main(String[] args) throws IOException {

		Properties config = new Properties();
		
		FileInputStream fileInputS = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		
		config.load(fileInputS);
		
		System.out.println(config.getProperty("browser"));
	}

	
	
	
	
	
}
