package com.arraylistclass;

import java.util.*;

public class ArrayListClassDemo4 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("nayan");
		list.add("ramesh00");
		list.addFirst("kallu");
		list.addLast("ketu");
		list.add(1234);
		list.add(null);
		list.add(null);
//		list.clear();
		
		list.ensureCapacity(3);
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf(1234));
		System.out.println(list.lastIndexOf(null));

		System.out.println(list);
		list.reversed();
		System.out.println(list);
		list.set(4, 589);
		System.out.println(list);

		List l = list.subList(3, 6);
		System.out.println(l);

		ListIterator litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		List list1 = new ArrayList();
//		list1.

	}
}
