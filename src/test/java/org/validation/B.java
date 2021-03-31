package org.validation;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class B {
	@Test
	public void testB1() {
		Assert.assertTrue(false);
		System.out.println("TestB1");
	}

	@Test
	public void testA2() {
		Assert.assertTrue(true);
		System.out.println("TestB2");
	}

	@Ignore
	@Test
	public void testB3() {
		Assert.assertTrue(true);
		System.out.println("TestB3");
	}

}
