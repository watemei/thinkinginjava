package org.watt.thinkinginjava.chp8;

public class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		System.out.println("Creating 2 " + this);
		this.shared = shared;
		this.shared.addRefcount();
	}

	protected void dispose() {
		System.out.println("Disposing 2 " + this);
		this.shared.dispose();
	}

	public String toString() {
		return "Composing: " + id;
	}
}
