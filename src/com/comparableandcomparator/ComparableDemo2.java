package com.comparableandcomparator;

class Hello implements Comparable{
	public int compareTo(Object o) {
		return 0;
	}
}

public class ComparableDemo2 {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		int a = h1.compareTo(h2);
		System.out.println(a);
	}
}
