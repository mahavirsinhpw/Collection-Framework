package com.hashsetclass;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(null);
		set.add(null);
		set.add("aa");
		set.add("bb");
		set.add("cc");
		set.add("dd");
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.add("aa"));
		System.out.println(set);
		
	}
}
