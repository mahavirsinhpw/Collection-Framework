package com.queue;

import java.util.PriorityQueue;

class Hello {

}

class Hi implements Comparable {

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class PriorityQueueDemo {
	public static void main(String[] args) {
		// FIFO
		// only same type of elements
		// elements of subType of Comparable or COmparator
		
		
//		  public java.util.PriorityQueue();
//		  public java.util.PriorityQueue(int);
//		  public java.util.PriorityQueue(java.util.Comparator<? super E>);
//		  public java.util.PriorityQueue(int, java.util.Comparator<? super E>);
//		  public java.util.PriorityQueue(java.util.Collection<? extends E>);
//		  public java.util.PriorityQueue(java.util.PriorityQueue<? extends E>);
//		  public java.util.PriorityQueue(java.util.SortedSet<? extends E>);
;		PriorityQueue pq = new PriorityQueue();
		pq.add("good morning");
		pq.add("ab");
//		pq.add(null);
//		pq.add(null);
//		pq.add(123);
		pq.add("ab");
		System.out.println(pq);

		PriorityQueue pq1 = new PriorityQueue();
		pq1.add(123);
		pq1.add(13);
		pq1.add(13);
		pq1.add(10);
		pq1.offer(120);
		pq1.offer(120);
		System.out.println("*********\n");
		System.out.println(pq1);
		System.out.println(pq1.peek());
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
//		pq1.add("test");
		System.out.println(pq1);

		PriorityQueue pq2 = new PriorityQueue();
		System.out.println("*******\n");
//		pq2.add(new Hello());
		pq2.add(new Hi());
//		pq2.add(11);
//		pq2.add(45);
		pq2.add(new Hi());
		System.out.println(pq2);
		

	}
}
