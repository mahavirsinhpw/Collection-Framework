package com.iteratorandListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ConcurrentModificationDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("aa");
		al.add("bb");
		al.add("cc");
		al.add("dd");
		al.add("ee");
		System.out.println(al);
		
		
//		Iterator itr =  al.iterator();
//		while (itr.hasNext()) {
//			String st = itr.next().toString();
//			if(st.equals("bb")) {
//				itr.remoce();   // it works fine
//			}
//		}
//		System.out.println(al);
		
//		Iterator itr =  al.iterator();
//		while (itr.hasNext()) {
//			String st = itr.next().toString();
//			if(st.equals("bb")) {
//				al.remove("cc");   // it gives CME
//			}
//		}
//		System.out.println(al);
		
		
//		Iterator itr =  al.iterator();
//		while (itr.hasNext()) {
//			String st = itr.next().toString();
//			if(st.equals("bb")) {
//				al.add("bb");		// it gives CME
//			}
//		}
//		System.out.println(al);
		
		
		ListIterator litr =  al.listIterator();
		while (litr.hasNext()) {
			String st = litr.next().toString();
			if(st.equals("bb")) {
				litr.add("bb");		// it works fine
			}
		}
		System.out.println(al);
		
		
	}
}
