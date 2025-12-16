package com.codegnan.multithreading;

public class CounterDre {
	 private int count = 10; // initial value

	    public void decrement() {
	        synchronized (this) {   // synchronized block
	            count--;
	        }
	    }

	    public int getCount() {
	        return count;
	    }

}
