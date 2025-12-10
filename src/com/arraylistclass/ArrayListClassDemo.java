package com.arraylistclass;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListClassDemo {
	public static void main(String[] args) {

		Collection col = new ArrayList();

		System.out.println(col.size());
		System.out.println(col.isEmpty());
		System.out.println(col);

		col.add("AA");
		col.add("BB");
		col.add("CC");
		col.add("DD");
		col.add("HELLO DOSTO");
		col.add("I AM JAVA FULL STACK DEVELOPER");
		col.add("I AM SOFTWARE ENGINEER IN PBC");
		col.add(123);

		System.out.println(col);
		System.out.println(col.size());
		System.out.println(col.isEmpty());

		col.remove("CC");
		System.out.println(col.contains("AA"));
		System.out.println(col.contains("CC"));
		System.out.println(col.size());

//		col.clear();
		System.out.println(col.size());
		System.out.println(col.isEmpty());

		col.toString();
		System.out.println(col);
		col.removeAll(col);
		System.out.println(col.size());
		System.out.println(col.isEmpty());

	}
}
