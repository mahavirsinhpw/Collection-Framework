package com.vectorClass;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

class Hai {

}

class Hello extends Hai {

}

public class VectorClassDemo {

	public static void main(String[] args) throws Exception {

		Vector v = new Vector();

		v.addElement(new Hello());
		v.addElement(new Hai());
		v.addElement("Welcome");
		v.addElement(123456); // method from older version.
		v.add(695); // overridden method from List interface. method from newer version
		System.out.println(v);

		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			Object ob = en.nextElement();
			System.out.println(ob);
		}

		Properties p = new Properties();
		p.put(1, "ab");
		p.put(2, "cd");
		p.put(3, "ef");
		p.put(3, 6);
		System.out.println(p);

		Enumeration e = p.elements();
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}

		FileReader fr = new FileReader("D:\\Notepad documents\\db.properties.txt");
		Properties pr = new Properties();
		pr.load(fr);
		System.out.println(pr.getProperty("username"));
		System.out.println(pr.getProperty("password"));

		FileWriter fw = new FileWriter("D:\\\\Notepad documents\\\\db.properties.txt");
		pr.setProperty("power", "superman");
		pr.setProperty("energy", "Hatke");
		pr.store(fw, "properties writting example");

		Properties prt = System.getProperties();
		Set set = prt.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
