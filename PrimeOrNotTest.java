package com.demo.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.demo.main.PrimeOrNot;

public class PrimeOrNotTest {
	@Test
	public void prime() {
		assertTrue(PrimeOrNot.isPrime());
			
	}
}
