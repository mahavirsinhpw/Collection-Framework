package com.linkedhashsetclass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo2 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(new Integer(99));
		System.out.println(hs.add("som"));
		hs.add("mp@1223");
		
		System.out.println(hs.add("som"));
		System.out.println(hs);
		System.out.println("*****\n");
		
		
		TreeSet ts = new TreeSet();
		//ts.add(new Integer(33));
		System.out.println(ts.add("som"));
		ts.add("mp@1223");
		ts.add("som");
		ts.add("aaaa");
		ts.add("cccc");
		ts.add("bbbb");
		System.out.println(ts);
		System.out.println("*****\n");
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Integer(99));
		System.out.println(lhs.add("som"));
		lhs.add("mp@1223");
		System.out.println(lhs.add("som"));
		System.out.println(lhs);
		
		
		
		
		
	}
}
