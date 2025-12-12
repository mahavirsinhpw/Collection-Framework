package com.treesetclass;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		// No null
		// No duplicate 
		// Only Same type elements
		// Sorted Order Maintained
		
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(2);
		ts.add(50);
		ts.add(10);
		ts.add(10);
//		ts.add(null);
//		ts.add("hello");
		System.out.println(ts);
		
		
		
	}
}
