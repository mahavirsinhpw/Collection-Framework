package com.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		pq.add(20);
//		pq.add(30);
//		pq.add(40);
//		pq.add(5);
		while(true) {
			int val = sc.nextInt();
			if(val==0) {
				break;
			}	
			pq.offer(val);
		}
		System.out.println(pq);
		System.out.println("number of values stored is %d.\n"+ pq.size());
		
		for(Integer in :pq) {
			System.out.println(in);
		}
		
		PQSort pqs = new PQSort();
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(8,pqs);
		System.out.println("enter the values of int type[0 -Exit]");
		while(true) {
			int val = sc.nextInt();
			if (val == 0) {
				break;
			}
			pq1.offer(val);
		}
		
		System.out.println("--");
		System.out.println("size\t: "+pq1.size());
		System.out.println(pq1.peek());
		System.out.println("size\t: "+pq1.size());
		System.out.println(pq1.poll());
		System.out.println("size\t: "+pq1.size());
		System.out.println("remainning values in pq1");
		for(Integer i : pq1) {
			System.out.println(i);
		}
		
		
		
	}
}

class PQSort implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2) {
		return i1-i2;
	}
}
