package com.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class CollectionsClassDemo2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("bb");
		al.add("cc");
		al.add("dd");
		al.add("aa");
		
//		al.add(new Integer(99));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		System.out.println("******\n");
		
		Collections.reverse(al);
		System.out.println(al);
		System.out.println("******\n");
		
		Collections.shuffle(al);
		System.out.println(al);
		System.out.println("******\n");
		
		Collections.rotate(al, 1);
		System.out.println(al);
		System.out.println("******\n");
		
		Collections.swap(al, 1, 3);
		System.out.println(al);
		System.out.println("******\n");
		
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		System.out.println("******\n");
		
		Collections.sort(al);
		System.out.println(Collections.binarySearch(al, "cc"));
		System.out.println("******\n");
		
		Collections.fill(al, "jtc");
		System.out.println(al);
		System.out.println("******\n");
		
		Vector v = new Vector();
		v.add("99");
		v.add("som");
		v.addElement("abc");
		Enumeration en = v.elements();
		
		List li = Collections.list(en);
		
		System.out.println(v);
		System.out.println(li);
		
		//li = Collections.unmodifiableList(li);
		
		//li.add("11");
		
		Collections.synchronizedCollection(al);
		System.out.println(al);
		Collections.singletonList(al);
		System.out.println(al);
		
		Collections.copy(al,v);
		System.out.println(al);
		
		System.out.println(Collections.reverseOrder());
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
	}
}
