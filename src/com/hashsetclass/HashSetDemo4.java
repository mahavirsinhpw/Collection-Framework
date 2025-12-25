package com.hashsetclass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo4 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Integer(99));
		System.out.println(hs.add("som"));
		
		hs.add("som@jtc");
		System.out.println(hs.add("som"));
		System.out.println(hs);
		
		TreeSet ts = new TreeSet();
//		ts.add(new Integer(99));				// Integer cannot be cast to class java.lang.String 
		System.out.println(ts.add("som"));
		ts.add("som@jtc");
//		System.out.println(ts.add("som"));
		
		TreeSet ts2 = new TreeSet();
//		ts2.add("som");							// String cannot be cast to class java.lang.Integer
//		ts2.add("som@jtc");
		ts2.add(new Integer(99));
		ts2.add(88);
		System.out.println(ts2);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Integer(99));
		System.out.println(lhs.add("som"));
		lhs.add("som@jtc");
		System.out.println(lhs.add("som"));
		System.out.println(lhs);
		
	}

}
