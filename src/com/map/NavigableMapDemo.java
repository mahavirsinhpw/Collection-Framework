package com.map;

import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {
		TreeMap<String,String> tm = new TreeMap<String, String>();
		tm.put("b", "banana");
		tm.put("b", "banana");
		tm.put("c", "cat");
		tm.put("d", "dog");
		tm.put("a", "apple");
		tm.put("g","gun");
		
		System.out.println(tm);
		System.out.println(tm.ceilingKey("c"));
		System.out.println(tm.ceilingKey("f"));
		System.out.println("*****\n");
		System.out.println(tm.higherKey("e"));
		System.out.println(tm.higherKey("c"));
		System.out.println("*****\n");
		System.out.println(tm.floorKey("e"));
		System.out.println(tm.floorKey("g"));
		System.out.println("*****\n");
		System.out.println(tm.lowerKey("e"));
		System.out.println(tm.lowerKey("g"));
		System.out.println("*****\n");
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.descendingMap());
		System.out.println(tm);
		
		
	}
}
