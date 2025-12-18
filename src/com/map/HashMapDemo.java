package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class Hello{
	
}

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap ha = new HashMap();
		ha.put("Hello", "hi");
		ha.put(112, "hi");
		ha.put(12, 12);
		ha.put(null, null);
		ha.put(null, null);
		ha.put(654, null);
		ha.put(12, 741);
		ha.put(new Hello(), "good morning");
		System.out.println(ha);
		
		Set keys = ha.keySet();
		Iterator itr = keys.iterator();
		if(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		
		Collection col =  ha.values();
		Iterator it =  col.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set set1 = ha.entrySet();
		Iterator itr1 = set1.iterator();
		
		while(itr1.hasNext()) {
			Map.Entry entry = (Entry) itr1.next();
			System.out.println("key : "+entry.getKey() + " "+ "value : "+entry.getValue());
		}
		
	}
}
