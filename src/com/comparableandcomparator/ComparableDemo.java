package com.comparableandcomparator;

public class ComparableDemo {
	public static void main(String[] args) {
		String s1 = "A"; //65
		String s2 = "B";//66
		int a = s1.compareTo(s2);
		System.out.println(a);
		int b = s2.compareTo(s1);
		System.out.println(b);
		
		String s3 = "A";		// 65
		String s4 = "D";		// 67
		int x = s3.compareTo(s4);
		int y = s4.compareTo(s3);
		System.out.println(x);
		System.out.println(y);
		
		String s5 = "ABC";		// 
		String s6 = "ACC";
		int p = s5.compareTo(s6);
		int q = s6.compareTo(s5);
		System.out.println(p);
		System.out.println(q);
		
		String s7 = "DEF";		// 
		String s8 = "ABC";
		int xx = s7.compareTo(s8);
		int yy = s8.compareTo(s7);
		System.out.println(xx);
		System.out.println(yy);
		
		String s9 = "AB"; //65,66
		String s10 = "CD";//67,68
		int aa = s9.compareTo(s10);
		System.out.println(aa);
		int bb = s10.compareTo(s9);
		System.out.println(bb);
		
		String s11 = "AE"; //65,69
		String s12 = "BD";//66,68
		int aaa = s11.compareTo(s12);
		System.out.println(aaa);
		int bbb = s12.compareTo(s11);
		System.out.println(bbb);
	}
}
