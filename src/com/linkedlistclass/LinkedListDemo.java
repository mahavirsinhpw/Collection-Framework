package com.linkedlistclass;

import java.util.Collections;
import java.util.LinkedList;
class Hello{
	
}

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("aa");
		ll.add("bb");
		ll.add("cc");
		ll.add(789);
		ll.add(null);
		ll.add(789);
		ll.add(new Hello());
		ll.add(null);
		ll.add(6, 66);
		ll.addAll(1, ll.subList(2, 4));
		System.out.println(ll);
		
		LinkedList li = new LinkedList();
		li.addAll(ll);
		li.addFirst("aaaaa");
		li.addLast("last one");
		System.out.println(li);
		System.out.println(li.element());
		li.offer(123);
		System.out.println(li);
		
		Collections.synchronizedList(li);
		
		
	}
}
