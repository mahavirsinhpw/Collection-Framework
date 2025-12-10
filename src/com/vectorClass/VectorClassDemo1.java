package com.vectorClass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class ABC{
	
}
public class VectorClassDemo1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(123);
		v.add("hello");
		v.add(new ABC());
		v.add(456);
		v.add(852);
		System.out.println(v);
		
		Vector v1 = new Vector();
		v1.add(123);
		v1.add(456);
		v1.add(852);
		v1.addElement(987);
		v1.addElement(654);
		
		Enumeration enm = v1.elements();
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		Iterator i1= v1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
