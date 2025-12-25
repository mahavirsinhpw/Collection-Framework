package com.map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
//		tm.put("sid", new Integer(99));
		tm.put("sname", "som");
//		tm.put("fee", new Double(9000.0));
		System.out.println(tm);
		System.out.println("****\n");
		
		tm.put("x", "10");
//		tm.put(new Integer(99), "10");
		System.out.println(tm);
		System.out.println("****\n");
		
//		tm.put(null, null);					// NullPointer exception
//		tm.put(null, "hello");
//		tm.put("hi", null);
		System.out.println(tm);
		System.out.println("****\n");
	}
}
