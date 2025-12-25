package com.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		map.put(i1, "som");
		map.put(i2, "prakash");
		System.out.println(map);

		IdentityHashMap map2 = new IdentityHashMap();

		map2.put(i1, "som");
		map2.put(i2, "prakash");
		System.out.println(map2);
	}
}
