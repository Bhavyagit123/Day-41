package com.codegnan.multithreading;

public class SharedString {
	private StringBuilder sb = new StringBuilder();

    public void appendChar(char ch) {
        synchronized (this) {   // synchronized block
            sb.append(ch);
        }
    }

    public String getString() {
        return sb.toString();
    }
}



