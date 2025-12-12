package com.linkedhashsetclass;

import java.util.LinkedHashSet;

class Hello{
	
}
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		// Maintain insertion order
		// No duplicate
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("hello");
		lhs.add(123);
		lhs.add(123);
		lhs.add(null);
		lhs.add(null);
		lhs.add(456);
		lhs.addFirst("hi");
		lhs.addLast("bye");
		lhs.add(new Hello());
		
		System.out.println(lhs);
		
		System.out.println(lhs.getFirst());
		System.out.println(lhs.getLast());
		System.out.println(lhs.reversed());
		System.out.println(lhs.newLinkedHashSet(2));
		
	}
}
