package com.linkedlistclass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Hai{
	
}

public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println(ll.size());
		System.out.println(ll);
		ll.add(123);
		ll.add("first");
		ll.addLast(new Hai());
		ll.add("last");
		System.out.println(ll);
		
		System.out.println("******HashCode******");
		System.out.println(ll.hashCode());
		System.out.println("\n");
		ll.addFirst("before first");
		ll.addLast("aftyer last");
		System.out.println(ll);
		System.out.println(ll.hashCode());
		
		
		System.out.println("*****\n");
		
		
		List li = new LinkedList();
		li.add("bac");
		li.add(123);
		System.out.println(li.add("bac"));
		System.out.println(li.add(456));
		System.out.println(li);
		li.addFirst("before first");
		li.addLast("after last");
		System.out.println(li);
		
		boolean b = li.contains(123);
		System.out.println(b);
		System.out.println(li);
		System.out.println("*****\n");
		
		LinkedList ll1 = new LinkedList();
		ll1.add(123);
		ll1.add("first");
		ll1.add("last");
		System.out.println(ll1);
		System.out.println(ll.contains(ll1));
		System.out.println(ll1.contains(ll));
		System.out.println(ll.containsAll(ll1));
		System.out.println(ll1.containsAll(ll));
		
		ll.addAll(ll1);
		ll.add(ll1);
		System.out.println(ll);
		System.out.println("****\n");
		
		
		
		System.out.println("using iterator");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("****\n");
		
	
	
		
		System.out.println("using list iterator");
		ListIterator ltr= ll.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("****\n");
		
		
		
		System.out.println("using for backward iteration");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
			Object o = ltr.previous();
			System.out.println(o);
		}
		
		System.out.println("****\n");
		
		
		
		
		
		
		
		
		
	}
}
