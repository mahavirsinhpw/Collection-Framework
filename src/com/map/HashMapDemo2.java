package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println("******\n");
		hm.put("sid", new Integer(99));
		hm.put("sname", "som");
		hm.put("email", "abc");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println("******\n");
		System.out.println(hm.containsKey("sid"));
		System.out.println(hm.containsKey("sid1"));
		System.out.println(hm.containsValue("som"));
		System.out.println(hm.containsValue("som1"));
		System.out.println("******\n");
		System.out.println(hm.get("sname"));
		System.out.println(hm);
		hm.put("sname", "rai");
		System.out.println(hm);
		System.out.println("******\n");
		hm.put(null, "rai");
		hm.put(new Double(999.99), null);
		System.out.println(hm);
		System.out.println("******\n");
		hm.put(null, "prakash");
		hm.put(new Double(999.99), null);
		System.out.println(hm);
		System.out.println("******\n");

		hm.remove("xx");
		System.out.println(hm);
		System.out.println("******\n");

		Collection col = hm.values();
		System.out.println(col);
		System.out.println("using keySet");
		Set s = hm.keySet();
		System.out.println(s);
		System.out.println("******\n");

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Object o = itr.next();
			String key = "";
			if (o != null) {
				key = o.toString();
			} else {
				key = null;
			}
			Object o2 = hm.get(key);
			String val = "";
			if (o2 != null) {
				val = o2.toString();
			} else {
				val = null;
			}
			System.out.println(key + " " + val);
		}
		System.out.println("*****\n");
		
		System.out.println("using EntrySet");
		Set entryset = hm.entrySet();
		Iterator it = entryset.iterator();
		
		while (it.hasNext()) {
			
			Object o = it.next();
			Map.Entry entry = (Map.Entry) o;
			
			Object o1 = entry.getKey();
			String key = "";
			if (o1 != null) {
				key = o1.toString();
			} else {
				key = null;
			}
			
			Object o2 = entry.getValue();
			String val = "";
			if(o2!=null) {
				val = o2.toString();
			} else {
				val = null;
			}
			
			System.out.println(key + " "+ val);
			
		}

	}
}
