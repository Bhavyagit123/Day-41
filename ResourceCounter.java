package com.codegnan.multithreading;

public class ResourceCounter {
	private int count = 10; // initial count

    // Synchronized method to increment
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to decrement
    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

}
