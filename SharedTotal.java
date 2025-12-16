package com.codegnan.multithreading;

public class SharedTotal {
	private int total = 0;

    public void add(int value) {
        synchronized (this) {   // synchronized block
            total += value;
        }
    }

    public int getTotal() {
        return total;
    }

}
