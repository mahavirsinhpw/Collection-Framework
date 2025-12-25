package com.vectorClass;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo3 {
	public static void main(String[] args) {
		Vector v = new Vector();
		ArrayList al = new ArrayList();
		
		System.out.println(al.size());
		System.out.println(al);
		
		al.add("aa");
		al.add("bb");
		al.add("cc");
		al.add("dd");
		al.add("ee");
		al.add("ff");
		System.out.println(al.size());
		System.out.println(al);
		System.out.println("******\n");
		
		v.addAll(al);
		System.out.println(v);
		v.add("xyz");
		v.add(123);
		v.addElement(123);
		System.out.println(v);
		System.out.println("*****\n");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		ListIterator ltr = v.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		
		
	}
}
