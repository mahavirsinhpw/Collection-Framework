package com.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();

		tm.put(10, "hello");
		tm.put(155, "come on");
		tm.put(160, "balle");
		tm.put(301, 3000);
		tm.put(501, 5000);
		tm.put(601, 6000);
		tm.put(701, 7000);
		tm.put(801, 8000);
		tm.put(51, 5100);
		tm.put(31, 3100);
		tm.put(21, 21000);

		System.out.println(tm);
		System.out.println(tm.ceilingKey(500));
		System.out.println(tm.ceilingEntry(123));
		System.out.println(tm.containsKey(10));
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.containsValue("hi"));
		System.out.println(tm.firstKey());
		System.out.println(tm.floorKey(41));
		System.out.println(tm.getOrDefault(41, 0));
		System.out.println(tm.higherKey(150));
		System.out.println(tm.lastKey());
		System.out.println(tm.lowerKey(155));
//		System.out.println(tm.putFirst(11, 1100));
		System.out.println(tm.putIfAbsent(41, 4000));
//		System.out.println(tm.putLast(201, 2000));
		System.out.println(tm.remove(41));
		System.out.println(tm.remove(41, 60));
		System.out.println(tm.size());
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.descendingMap());
		System.out.println(tm.floorEntry(10));
		System.out.println(tm.headMap(99));
		System.out.println(tm.headMap(100, true));
		System.out.println(tm.lastEntry());
		System.out.println(tm.lowerEntry(200));
		System.out.println(tm.reversed());
		System.out.println(tm.navigableKeySet());
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.subMap(31, 51));
		System.out.println(tm.subMap(501, false, 801, true));
		System.out.println(tm.tailMap(401));
		System.out.println(tm.tailMap(601, false));
		System.out.println(tm);

	}
}
