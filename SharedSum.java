package com.codegnan.multithreading;

public class SharedSum {
	private int sum = 0;

    public void addValue(int value) {
        synchronized (this) {   // synchronized block
            sum += value;
        }
    }

    public int getSum() {
        return sum;
    }

}
