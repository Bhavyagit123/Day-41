package com.codegnan.multithreading;

import java.util.Scanner;

public class TurnCounterMain {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TurnCounter counter = new TurnCounter(n);

        Thread t1 = new Thread(() -> counter.print(true));
        Thread t2 = new Thread(() -> counter.print(false));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}
