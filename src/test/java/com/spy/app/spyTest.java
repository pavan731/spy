package com.spy.app;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class spyTest {

	/**
	 * 
	 */
	@Test
	void test() {
		assertTrue(spy.spyy(123));
		assertFalse(spy.spyy(1273));
	}

}
