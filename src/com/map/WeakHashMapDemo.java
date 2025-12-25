package com.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap wm = new WeakHashMap();
		Temp t = new Temp();
		wm.put(t, "som");
		System.out.println(wm);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(wm);
		System.out.println("****\n");
		
		HashMap m = new HashMap();
		Temp t1 = new Temp();
		m.put(t1, "som");
		System.out.println(m);
		t1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		
	}

}

class Temp {
	public String toString() {
		return "temp";
	}
	
	public void finalize() {
		System.out.println("finalize method called");
	}
	
}
