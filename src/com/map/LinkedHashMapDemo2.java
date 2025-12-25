package com.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo2 {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put("sid", new Integer(99));
		lhm.put("sname", "som");
		lhm.put("fee", new Double(9000.0));
		System.out.println(lhm);
		System.out.println("****\n");
		
		lhm.put("x", "10");
		lhm.put(new Integer(99), "10");
		System.out.println(lhm);
		System.out.println("****\n");
		
		lhm.put(null, null);
		System.out.println(lhm);
		System.out.println("****\n");
		
		Hashtable ht = new Hashtable();
		ht.put("sid", new Integer(99));
		ht.put("sname", "som");
		ht.put("fee", new Double(9000.0));
		System.out.println(ht);
		System.out.println("****\n");
		
		ht.put("x", "10");
		ht.put(new Integer(99), "10");
		System.out.println(ht);
		System.out.println("****\n");
		
//		ht.put(null, null);					// NullPointer exception
//		ht.put(null, "hello");
//		ht.put("hi", null);
		System.out.println(ht);
		System.out.println("****\n");
		
		
		
	}
}
