package com.codegnan.multithreading;

public class LimitedCounter {
	private int count = 0;
    private static final int MAX = 10;

    public void increment() {
        synchronized (this) {   // synchronized block
            if (count < MAX) {
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }

}
