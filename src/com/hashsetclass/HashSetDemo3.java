package com.hashsetclass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HashSetDemo3 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("aa");
		hs.add("bb");
		hs.add("cc");
		hs.add("dd");
		
		System.out.println(hs);
		System.out.println("******\n");
		List li = new ArrayList(hs);
		
		ListIterator ltr = li.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
	}
}
