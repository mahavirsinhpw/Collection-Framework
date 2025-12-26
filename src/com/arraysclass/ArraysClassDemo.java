package com.arraysclass;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysClassDemo {
	public static void main(String[] args) {
		int[] ar = { 10, 45, 25, 6, 78, 12, 21 };
		int[] ar1 = { 10, 45, 25, 6, 78, 12, 21 };
		int[] ar2 = { 10, 45, 85, 45, 12, 78, 896 };

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + "\t");
		}
		System.out.println("*****\n");
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i] + "\t");
		}
		System.out.println("*****\n");
		for (int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i] + "\t");
		}
		System.out.println("*****\n");
		System.out.println("\n Array after sorting");

		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + "\t");
		}
		System.out.println("*****\n");
		// must be sorted
		System.out.println(Arrays.binarySearch(ar, 10));
		// If the element is NOT found 11 should be inserted at index 2 (after 10)
		// Return value = -(6) - 1 = -3
		System.out.println(Arrays.binarySearch(ar, 11));
		System.out.println("*****\n");
		System.out.println(Arrays.equals(ar, ar1));
		System.out.println(Arrays.equals(ar, ar2));
		System.out.println("*****\n");

		Arrays.fill(ar, 32);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + "\t");
		}
		System.out.println("****\n");
		Object[] ob = { "jtc", "india", "som", "rai", "white", "red" };
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i] + "\t");
		}
		System.out.println("****\n");

		List list = Arrays.asList(ob);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("****\n");
		
		Arrays.sort(ob);
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i] + "\t");
		}

	}
}
