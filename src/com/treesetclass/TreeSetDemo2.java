package com.treesetclass;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("B"));
		ts.add(new StringBuffer("C"));
		ts.add(new StringBuffer("D"));
//		ts.add(null);
		System.out.println(ts);
		
		TreeSet ts1 = new TreeSet();
//		ts1.add(null);
//		ts1.add(new StringBuffer("A"));
//		ts1.add(new StringBuffer("B"));
//		ts1.add(new StringBuffer("C"));
//		ts1.add(new StringBuffer("D"));
		System.out.println(ts1);
		
		
		
		
		
	}
}
