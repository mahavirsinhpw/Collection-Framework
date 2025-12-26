package com.calender;

import java.util.Calendar;
import java.util.Formatter;

public class ClaenderClassDemo {
	public static void main(String[] args) {

		Formatter fm = new Formatter();
		String name = "MahavirSinh";
		int age = 32;
		fm.format("my name is %s and age is %d", name, age);
		System.out.println(fm);

		Formatter fm2 = new Formatter();
		fm2.format("%c - %f - %b %n%05d- %o-%x-%X", 'C', 99.99, true, 3456, 3456, 3456, 3456, 3456);
		System.out.println(fm2);

		Formatter fm3 = new Formatter();
		Calendar cl = Calendar.getInstance();
		fm3.format("%tr %n %tc %n %tl: %tM", cl, cl, cl, cl);
	}
}
