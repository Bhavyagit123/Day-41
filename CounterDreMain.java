package com.codegnan.multithreading;

import java.util.Scanner;

public class CounterDreMain {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CounterDre counter = new CounterDre();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.decrement();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.decrement();
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
