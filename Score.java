package com.codegnan.multithreading;

public class Score {
	private int score = 0; // initial score

    // Synchronized method to increment score
    public synchronized void increment() {
        score++;
    }

    public int getScore() {
        return score;
    }

}
