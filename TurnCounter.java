package com.codegnan.multithreading;

public class TurnCounter {
	private int number = 1;
    private int n;
    private boolean turn = true; // true → thread1, false → thread2

    public TurnCounter(int n) {
        this.n = n;
    }

    public void print(boolean myTurn) {
        while (true) {
            synchronized (this) {
                while (turn != myTurn) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }

                if (number > n) {
                    notifyAll();
                    break;
                }

                System.out.print(number + " ");
                number++;
                turn = !turn;
                notifyAll();
            }
        }
    }

}
