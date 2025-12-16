package com.codegnan.multithreading;

import java.util.Scanner;

public class InventoryMain {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Inventory inventory = new Inventory();

        // Thread to add items
        Thread addThread = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                inventory.addItem();
            }
        });

        // Thread to remove items
        Thread removeThread = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                inventory.removeItem();
            }
        });

        addThread.start();
        removeThread.start();

        addThread.join();
        removeThread.join();

        // Final inventory count
        System.out.println(inventory.getCount());
    }

}
