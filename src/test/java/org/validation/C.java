package org.validation;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class C {
	@Test
	public void testC1() {
		Assert.assertTrue("verify password",false);
		System.out.println("TestC1");
	}

	@Ignore
	@Test
	public void testC2() {
		Assert.assertTrue(true);
		System.out.println("TestC2");
	}

	@Test
	public void testC3() {
		Assert.assertTrue(true);
		System.out.println("TestC3");
	}

}
