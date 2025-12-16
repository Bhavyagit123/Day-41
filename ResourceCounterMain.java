package com.codegnan.multithreading;

import java.util.Scanner;

public class ResourceCounterMain {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ResourceCounter counter = new ResourceCounter();

        // Increment thread
        Thread incThread = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.increment();
            }
        });

        // Decrement thread
        Thread decThread = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.decrement();
            }
        });

        incThread.start();
        decThread.start();

        incThread.join();
        decThread.join();

        // Final output
        System.out.println(counter.getCount());
    }

}
