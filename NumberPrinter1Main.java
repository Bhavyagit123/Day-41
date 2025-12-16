package com.codegnan.multithreading;

import java.util.Scanner;

public class NumberPrinter1Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        NumberPrinter1 printer = new NumberPrinter1(n);

        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        // Start odd thread first
        oddThread.start();
        oddThread.join();

        // Then start even thread
        evenThread.start();
        evenThread.join();

        // Final output
        System.out.println(printer.getResult());
    }

}
