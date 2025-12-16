package com.codegnan.multithreading;

import java.util.Scanner;

public class NumberPrinterMain {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        NumberPrinter printer = new NumberPrinter(n);

        Thread t1 = new Thread(() -> printer.printOdd());
        Thread t2 = new Thread(() -> printer.printEven());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}
