package com.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo3 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(111);
		pq.add(201);
		pq.add(51);
		pq.add(501);
		pq.add(601);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
	}
}
