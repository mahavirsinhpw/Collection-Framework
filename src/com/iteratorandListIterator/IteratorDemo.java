package com.iteratorandListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("aa");
		al.add("bc");
		al.add("gg");
		al.add("hm");
		al.add("hi");

		al.remove(2);
		al.remove("hm");
		System.out.println(al);
		al.add(2, "de");
		al.set(3, "fg");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {

			Object ob = itr.next();
			System.out.println(ob);
		}

//		Iterator itr1 = al.iterator();

//		while(itr.hasNext()) {
//			
//			Object ob= itr.next();
//			System.out.println(ob);
//		}

		ListIterator litr = al.listIterator();
		while (litr.hasPrevious()) {
			Object o = litr.previous();
			System.out.println(o);
		}

		while (litr.hasNext()) {
			Object o = litr.next();
			System.out.println(o);
		}

		while (litr.hasPrevious()) {
			Object o = litr.previous();
			System.out.println(o);
		}

	}

}
