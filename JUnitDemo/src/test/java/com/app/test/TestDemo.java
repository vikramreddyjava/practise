package com.app.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDemo {

	@BeforeClass
	public static void onetimeBefore() {
		System.out.println("Before All");
	}

	@Before
	public void preWork() {
		System.out.println("Before");
	}

	@Test
	public void testA() {

		System.out.println("Test-1");

	}

	@Test
	public void testB() {

		System.out.println("Test-2");

	}

	@Test
	public void testC() {

		System.out.println("Test-3");

	}

	@Test
	public void testCD() {

		System.out.println("Test-4");

	}

	@After
	public void postWork() {
		System.out.println("After");

	}

	@AfterClass

	public static void onetimeAfter() {
		System.out.println("Afer All");
	}

}
