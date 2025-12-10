package com.arraylistclass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassDemo3 {

	public static void main(String[] args) {

		List li = new ArrayList();

		li.add("abc");
		li.add("xyz");
		li.add("AB");
		li.add("PQ");

		System.out.println(li);

		List list = new ArrayList();
		list.add("CV");
		list.add("po");
		list.add(1230);

		System.out.println(list);

//		list.add(li);
		System.out.println(list);

		list.addAll(li);
		System.out.println(list);

		System.out.println(list.contains(li));
		System.out.println(list.containsAll(li));

		list.remove(0);
		System.out.println(list);
		list.removeAll(li);
		System.out.println(list);

		System.out.println(list.retainAll(li));

	}

}
