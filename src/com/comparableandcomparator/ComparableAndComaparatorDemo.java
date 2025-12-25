package com.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

//class Student implements Comparable {
class Student implements Comparable<Student> {

	int sid;
	String name;
	int rollNo;

	public Student(int sid, String name, int rollNo) {
		super();
		this.sid = sid;
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo, sid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo && sid == other.sid;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", rollNo=" + rollNo + "]";
	}

//	public int compareTo(Object o) {
//		Student s = (Student)o;
//		return this.sid - s.sid;
//	}

	public int compareTo(Student s) {
		return this.sid - s.sid;
	}

}

class StudentRollComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.rollNo, s2.rollNo);
	}
}

//class StudentRoll implements Comparator{
//	
//	public int compare(Object o1, Object o2) {
//		Student s1 = (Student) o1;
//		Student s2 = (Student) o2;
//		return Integer.compare(s1.rollNo, s2.rollNo);
//	}
//}

class StudentNameComparator implements Comparator<Student>{
	
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

//class StudentNameComparator implements Comparator {
//
//	public int compare(Object o1, Object o2) {
//		Student s1 = (Student) o1;
//		Student s2 = (Student) o2;
//		return s1.name.compareTo(s2.name);
//	}
//}

public class ComparableAndComaparatorDemo {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(new Student(22, "mp", 125));
		al.add(new Student(9, "kp", 220));
		al.add(new Student(65, "hm", 960));
		al.add(new Student(79, "mlp", 40));

		System.out.println("no sorting");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s);
		}
		System.out.println("*****\n");

		System.out.println("sorting sid using Comparable");
		Collections.sort(al);
		Iterator<Student> st =  al.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		System.out.println(al);
		System.out.println("*****\n");

		System.out.println("sorting roll using Comparator");
		Collections.sort(al, new StudentRollComparator());
		System.out.println(al);
		System.out.println("*****\n");

		System.out.println("sorting name using Comparator");
		Collections.sort(al, new StudentNameComparator());
		System.out.println(al);

	}
}
