package com.iteratorandListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIteratorDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("aa");
		al.add("bc");
		al.add("gg");
		al.add("hm");
		al.add("hi");
		System.out.println(al);
		
		Iterator itr = al.iterator();
//		while(itr.hasNext()) {
//			String st= itr.next().toString();
//			if(st.equals("hm")) {
//				al.add("hm next");				// concurrentModification Exception
//			}
//		}
//		System.out.println(al);
		
		
		
//		while(itr.hasNext()) {
//			String st= itr.next().toString();
//			if(st.equals("hm")) {
//				al.remove("hm");
//			}
//		}
//		System.out.println(al);
		
		
		
//		while (itr.hasNext()) {
//		    String st = (String) itr.next();
//		    al.remove(st);     // structural modification
//		}
		
		
		
		while (itr.hasNext()) {
		    String st = itr.next().toString();
		    if (st.equals("bc")) {
		        al.remove("gg");   // Removing some OTHER element
		    }
		}
		
		
//		while(itr.hasNext()) {
//			String st= itr.next().toString();
//			if(st.equals("hi")) {
//				itr.remove();
//				
//			}
//		}
//		System.out.println(al);
		
		
		
//		ListIterator lit = al.listIterator();
//		while(lit.hasNext()) {
//			String st= lit.next().toString();
//			if(st.equals("hm")) {
//				lit.add("hm next");
//			}
//		}
//		System.out.println(al);
		
		
	}
}
