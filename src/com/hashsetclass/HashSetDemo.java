package com.hashsetclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		
		// NO insertion order maintained
		// NO duplicate elements
	
		hs.add("10");
		hs.add(20);
		hs.add("hello");
		hs.add(500);
		hs.add(null);
		hs.add(null);
		hs.add(20);
		System.out.println(hs);
		
//		hs.clear();
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		// can not use ListIterator directly to access elements
//		ListIterator lit = hs.iterator()
		
		List li = new ArrayList(hs);
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
