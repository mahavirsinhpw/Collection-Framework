package com.arraylistclass;

public class MyArrayList {
	
	private Object elements[] = null;
	private int capacity;
	private int size;
	
	public boolean add(int index, Object obj) {
		if(index>size || index<0) {
			throw new IndexOutOfBoundsException("index:"+index+"size: "+size);
		}
		
		if(size == capacity) {
			int newcap = capacity*2;
			Object newelement[] = new Object[newcap]; 
		}
		// pending
		return true;
	}
}
