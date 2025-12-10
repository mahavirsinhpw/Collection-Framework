package com.arraylistclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListClassDemo2 {
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

		System.out.println("******Iterator*******\n");
		Iterator itr = col.iterator();

		while (itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
//			System.out.println(itr.next());
		}

		System.out.println("*****toArray******\n");
		Object[] oAr = col.toArray();
		for (Object obj : oAr) {
			System.out.println(obj);
		}

	}
}
