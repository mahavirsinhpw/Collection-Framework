package com.vectorClass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("99");
		v.add("som");
		v.addElement("jkl");
		v.addLast(632);
		System.out.println(v);
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		
	}
}
