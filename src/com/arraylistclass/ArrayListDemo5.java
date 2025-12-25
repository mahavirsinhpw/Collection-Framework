package com.arraylistclass;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		al.add(new Integer(100));
		al.add("SOM");
		al.add(123);
		al.add("mahavir");
		al.add(new Double(50.20));
		al.add(new Long(55555));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		Object[] ob = al.toArray();
		for(int i =0; i<al.size(); i++) {
			System.out.println(ob[i]);
		}
		
		
		System.out.println("Checking and Casting");
		for(int i =0; i<ob.length; i++) {
			Object obj = ob[i];
			if(obj instanceof String) {
			String str = (String)obj;
			System.out.println(str);
			} else if(obj instanceof Integer) {
				Integer in = (Integer) obj;
				System.out.println(in);
				} else if (obj instanceof Double) {
					Double d = (Double) obj;
					System.out.println(d);
				}
		}
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
		System.out.println(al.contains("SOM"));
		System.out.println(al.contains("jtc"));
		System.out.println(al);
		
		al.add(123);
		al.add("123");
		System.out.println(al);
//		al.remove(123);
		al.remove("123");
		System.out.println(al);
		al.remove("mahavir");
		System.out.println(al);
		
		
		ArrayList al1 = new ArrayList();
		al1.add("ab");
		al1.add("bc");
		al1.add("cd");
		System.out.println(al1);
		System.out.println(al);
		
//		al.add(al1);
//		System.out.println(al);
		al.addAll(al1);
		System.out.println(al);
		
		System.out.println(al.containsAll(al1));
		System.out.println(al);
//		al.removeAll(al1);
//		System.out.println(al);
		
		al.add("jtc");
		al1.add("jtc");
		System.out.println(al);
		System.out.println(al1);
		
		al.retainAll(al1);
		System.out.println("al after retainAll common elements from both list: " + al);
		
		
		al.clear();
		System.out.println(al);
		
		
		
		
		
	}
}
