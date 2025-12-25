package com.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

class Doctor1 {
	int did;
	String name;
	String specialist;
	String email;
	int fee;

	@Override
	public String toString() {
		return "Doctor1 [did=" + did + ", name=" + name + ", specialist=" + specialist + ", email=" + email + ", fee="
				+ fee + "]";
	}

	public Doctor1(int did, String name, String specialist, String email, int fee) {
		super();
		this.did = did;
		this.name = name;
		this.specialist = specialist;
		this.email = email;
		this.fee = fee;
	}

	@Override
	public int hashCode() {
		return Objects.hash(did, email, fee, name, specialist);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor1 other = (Doctor1) obj;
		return did == other.did && Objects.equals(email, other.email) && fee == other.fee
				&& Objects.equals(name, other.name) && Objects.equals(specialist, other.specialist);
	}

	public Doctor1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

class NameComparator implements java.util.Comparator<Doctor1>{
	

	@Override
	public int compare(Doctor1 o1, Doctor1 o2) {
		return o1.name.compareTo(o2.name);
	}
}

class Email implements java.util.Comparator<Doctor1>{
	
	public int compare(Doctor1 d1, Doctor1 d2) {
		return d1.email.compareTo(d2.email);
	}
}

class Fee implements java.util.Comparator<Doctor1>{
	public int compare(Doctor1 d1, Doctor1 d2) {
		return Integer.compare(d1.fee, d2.fee);
	}
}

public class Comparator {
	public static void main(String[] args) {
		ArrayList<Doctor1> al = new ArrayList<Doctor1>();

		al.add(new Doctor1(202, "mahesh", "ortho", "m@123", 1000));
		al.add(new Doctor1(405, "pritesh", "nuero", "p@123", 500));
		al.add(new Doctor1(101, "kamlesh", "pulmo", "k@123", 15000));
		al.add(new Doctor1(901, "baghesh", "opthelmo", "b@123", 2000));
		al.add(new Doctor1(50, "ashish", "sergon", "a@123", 4000));

		Collections.sort(al, new NameComparator());
		Iterator<Doctor1> itr = al.iterator();
		while(itr.hasNext()) {
			Doctor1 d= itr.next();
			System.out.println(d.name+" "+d.fee);
//			System.out.println(itr.next());
		}
		
		System.out.println(al);
		Collections.sort(al,new Email());
		System.out.println(al);
		Collections.sort(al, new Fee());
		System.out.println(al);
		

	}
}
