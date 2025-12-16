package com.codegnan.multithreading;

import java.util.Scanner;

public class SharedBufferMain {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);

        SharedBuffer shared = new SharedBuffer();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                shared.appendChar(ch);
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                shared.appendChar(ch);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Final buffer output
        System.out.println(shared.getBuffer());
    }

}
