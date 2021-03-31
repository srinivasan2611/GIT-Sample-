package org.validation;

import org.junit.Assert;
import org.junit.Test;

public class A {
	@Test
	public void testA1() {
		Assert.assertTrue(false);
		System.out.println("TestA1");
	}

	@Test
	public void testA2() {
		Assert.assertTrue("verify test", true);
		System.out.println("TestA2");
	}

	@Test
	public void testA3() {
		Assert.assertTrue(true);
		System.out.println("TestA3");
	}

}
