package com.codegnan.multithreading;

import java.util.Scanner;

public class SharedStringMain {
	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        char ch = sc.next().charAt(0);

	        SharedString shared = new SharedString();

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

	        // Output final string
	        System.out.println(shared.getString());
	    }

}
