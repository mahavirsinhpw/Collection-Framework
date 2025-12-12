package com.treesetclass;

import java.util.TreeSet;
class Hello implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Hi{
	
}

public class TreeSetDemo {
	public static void main(String[] args) {
		
		// No null
		// No duplicate 
		// Only Same type elements
		// Sorted Order Maintained
		// elements of subType of Comparable or Comparator
		
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(2);
		ts.add(50);
		ts.add(10);
		ts.add(10);
//		ts.add(null);
//		ts.add("hello");
		ts.add(new Hello());
//		ts.add(new Hi());
		System.out.println(ts);
		
		
		
		
	}
}
