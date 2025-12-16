package com.codegnan.multithreading;

import java.util.Scanner;

public class SharedTotalMain {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = sc.nextInt();

        SharedTotal shared = new SharedTotal();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                shared.add(value);
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                shared.add(value);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Final output
        System.out.println(shared.getTotal());
    }

}
