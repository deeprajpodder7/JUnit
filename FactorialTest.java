package com.demo.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.demo.main.Factorial;


public class FactorialTest {
	@Test
	public void fact() {
		assertTrue(Factorial.factorial());
			
	}
}
