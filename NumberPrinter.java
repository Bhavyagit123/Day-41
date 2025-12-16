package com.codegnan.multithreading;

public class NumberPrinter {
	private int number = 1;
    private int n;
    private boolean isOddTurn = true;

    public NumberPrinter(int n) {
        this.n = n;
    }

    // Synchronized method for odd numbers
    public synchronized void printOdd() {
        while (number <= n) {
            while (!isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            if (number <= n) {
                System.out.print(number + " ");
                number++;
                isOddTurn = false;
                notify();
            }
        }
    }

    // Synchronized method for even numbers
    public synchronized void printEven() {
        while (number <= n) {
            while (isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            if (number <= n) {
                System.out.print(number + " ");
                number++;
                isOddTurn = true;
                notify();
            }
        }
    }

}
