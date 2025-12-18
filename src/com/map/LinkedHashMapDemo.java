package com.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put(null, null);
		map.put("abc", "abc");
		map.put("abc", 123);
		map.put(null, "kjy");
		map.put(456, 987);
		System.out.println(map);

		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
//			Object key = itr.next();
			System.out.println(itr.next());
		}

		Collection col = map.values();
		Iterator itr1 = col.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		Set entrySet = map.entrySet();
		Iterator itr2 = entrySet.iterator();
		while (itr2.hasNext()) {
			Map.Entry entry = (Entry) itr2.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		LinkedHashMap<Integer, Integer> lmap = new LinkedHashMap<Integer, Integer>();
		LinkedHashMap<Integer, Integer> lmap1 = new LinkedHashMap<Integer, Integer>(10);
		LinkedHashMap<Integer, Integer> lmap2 = new LinkedHashMap<Integer, Integer>(map);
		LinkedHashMap<Integer, Integer> lmap3 = new LinkedHashMap<Integer, Integer>(20, 20);
		LinkedHashMap<Integer, Integer> lmap4 = new LinkedHashMap<Integer, Integer>(5,16,false);
		LinkedHashMap<Integer, Integer> lmap5 = new LinkedHashMap<Integer, Integer>(5, 16, true);
		
		lmap4.put(null, null);
		lmap4.put(10, 20);
		lmap4.put(200, 100);
		lmap4.put(5, 3);
		lmap4.put(50, 50);
		System.out.println(lmap4);
		
		Set set = lmap4.entrySet();
		Iterator itr4 = set.iterator();
		//for(Map.Entry<Integer, Integer> entry : )
		
		lmap5.put(null, null);
		lmap5.put(10, 20);
		lmap5.put(200, 100);
		lmap5.put(5, 3);
		lmap5.put(50, 50);
		System.out.println(lmap5);
		
	}
}
