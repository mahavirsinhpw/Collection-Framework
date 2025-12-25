package com.arraylistclass;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo6 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Integer(99));
		al.add("som");
		al.add(123);
		al.add("mp@123");
		System.out.println(al);
		al.add(0, "aaaa");
		al.add(1, "bbbb");
		al.add("bbbb");
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.indexOf("mp@123"));
		System.out.println(al.lastIndexOf("bbbb"));
		al.set(1, "abab");
		System.out.println(al);
		List list = al.subList(2, 5);
		System.out.println(list);
		
		ListIterator ltr = al.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}
}
