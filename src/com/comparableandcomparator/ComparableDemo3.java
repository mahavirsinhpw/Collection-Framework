package com.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Doctor implements Comparable<Doctor> {
	int did;
	String name;
	String specialist;
	String email;
	int fee;

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", name=" + name + ", specialist=" + specialist + ", email=" + email + ", fee="
				+ fee + "]";
	}

	public Doctor(int did, String name, String specialist, String email, int fee) {
		super();
		this.did = did;
		this.name = name;
		this.specialist = specialist;
		this.email = email;
		this.fee = fee;
	}

//	public int compareTo(Doctor d) {
//	return this.did - d.did;
//}

//	public String compareTo(Doctor d) {
//		return this.name.compareTo(d.name);
//	}

	public int compareTo(Doctor d) {
		return this.fee - d.fee;
	}

}

public class ComparableDemo3 {
	public static void main(String[] args) {
		ArrayList<Doctor> al = new ArrayList<Doctor>();
		al.add(new Doctor(202, "mahesh", "ortho", "m@123", 1000));
		al.add(new Doctor(405, "pritesh", "nuero", "p@123", 500));
		al.add(new Doctor(101, "kamlesh", "pulmo", "k@123", 15000));
		al.add(new Doctor(901, "baghesh", "opthelmo", "b@123", 2000));
		al.add(new Doctor(50, "ashish", "sergon", "a@123", 4000));

		Collections.sort(al);
		System.out.println(al);
		Iterator<Doctor> itr = al.iterator();
		while (itr.hasNext()) {
//	 		Object o = itr.next();
//	 		Doctor d = (Doctor) o;
//	 		System.out.println(d);
			System.out.println(itr.next());
		}

	}
}
