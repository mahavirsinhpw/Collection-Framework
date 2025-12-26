package com.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import java.sql.*;
import java.util.Properties;

public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String pswd = p.getProperty("pswd");

//		Connection con = DriverManager.getConnection(url, user, pswd);
		FileOutputStream fos = new FileOutputStream("db.properties");
		p.store(fos, "updated by mahavirsinh");
		

	}
}
