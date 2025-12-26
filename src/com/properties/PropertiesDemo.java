package com.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);

		String s = p.getProperty("som");
		System.out.println(s);
		p.setProperty("mahavir", "Pravinsinh");
		System.out.println(p);

		Enumeration e = p.propertyNames();
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
		}
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "updated by mahavirsinh");

	}
}
