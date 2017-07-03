package org.watt.thinkinginjava.chp8;

import org.junit.Test;

/**
 * Hello world!
 *
 */
public class Test832 {
	/**
	 * 单个shared
	 */
	@Test
	public void sharedTest() {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared) };
		for (Composing c : composing) {
			c.dispose();
		}
	}

	/**
	 * 多个shared
	 */
	@Test
	public void sharedesTest() {
		Shared shared = new Shared();
		Shared shared1 = new Shared();
		Shared shared2 = new Shared();
		Composing[] composing = { new Composing(shared), new Composing(shared1), new Composing(shared2) };
		for (Composing c : composing) {
			c.dispose();
		}
	}

}
