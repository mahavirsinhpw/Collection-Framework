package com.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

// sort method of Collections class.

class Student implements Comparable<Student>{
	int sid;
	String sname;
	String email;
	public Student(int sid, String sname, String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, sid, sname);
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
		return Objects.equals(email, other.email) && sid == other.sid && Objects.equals(sname, other.sname);
	}
	
	public int compareTo(Student s) {
		return this.sid-s.sid;
	}
}

class sNameComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s1.sname.compareTo(s2.sname);
	}
}

public class CollectionsClassDemo {
	public static void main(String[] args) {
		ArrayList<Student> sl = new ArrayList<Student>();
		sl.add(new Student(101, "ramesh", "r@123"));
		sl.add(new Student(901, "avesh", "a@123"));
		sl.add(new Student(301, "mahesh", "m@123"));
		sl.add(new Student(201, "pamesh", "p@123"));
		sl.add(new Student(501, "kamlesh", "k@123"));
		
		System.out.println(sl);
		Collections.sort(sl);
		Iterator<Student> itr = sl.iterator();
		while (itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.sid +" "+st.sname+" "+st.email);	
		}
		
		System.out.println("******\n");
		
		System.out.println(sl);
		Collections.sort(sl, new sNameComparator());
		Iterator<Student> itr1 = sl.iterator();
		while (itr1.hasNext()) {
			Student st = itr1.next();
			System.out.println(st.sid +" "+st.sname+" "+st.email);	
		}
		
		
	}
}

