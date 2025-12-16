package com.codegnan.multithreading;

public class SharedBuffer {
	private StringBuilder buffer = new StringBuilder();

    public void appendChar(char ch) {
        synchronized (this) {   // synchronized block
            buffer.append(ch);
        }
    }

    public String getBuffer() {
        return buffer.toString();
    }

}
