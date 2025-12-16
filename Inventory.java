package com.codegnan.multithreading;

public class Inventory {
	private int count = 10; // initial inventory

    // Synchronized method to add items
    public synchronized void addItem() {
        count++;
    }

    // Synchronized method to remove items
    public synchronized void removeItem() {
        count--;
    }

    public int getCount() {
        return count;
    }

}
