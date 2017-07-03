package org.watt.thinkinginjava.chp8;

public class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		System.out.println("Creating 1 " + this);
	}

	public void addRefcount() {
		refcount++;
	}

	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("Disposing 1 " + this);
		}
	}

	public String toString() {
		return "Shared: " + id;
	}
}
