package com.codegnan.multithreading;

import java.util.Scanner;

public class LimitedCounterMain {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LimitedCounter counter = new LimitedCounter();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Final output
        System.out.println(counter.getCount());
    }

}
