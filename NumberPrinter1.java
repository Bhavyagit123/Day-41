package com.codegnan.multithreading;

public class NumberPrinter1 {
	 private StringBuilder result = new StringBuilder();
	    private int n;

	    public NumberPrinter1(int n) {
	        this.n = n;
	    }

	    // Synchronized method to print odd numbers
	    public synchronized void printOdd() {
	        for (int i = 1; i <= n; i += 2) {
	            result.append(i).append(" ");
	        }
	    }

	    // Synchronized method to print even numbers
	    public synchronized void printEven() {
	        for (int i = 2; i <= n; i += 2) {
	            result.append(i).append(" ");
	        }
	    }

	    public String getResult() {
	        return result.toString().trim();
	    }

}
