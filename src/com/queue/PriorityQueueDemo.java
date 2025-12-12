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
		
		PriorityQueue pq = new PriorityQueue();
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
//		pq1.add("test");
		System.out.println(pq1);

		PriorityQueue pq2 = new PriorityQueue();
//		pq2.add(new Hello());
		pq2.add(new Hi());
//		pq2.add(11);
//		pq2.add(45);
		pq2.add(new Hi());
		System.out.println(pq2);

	}
}
