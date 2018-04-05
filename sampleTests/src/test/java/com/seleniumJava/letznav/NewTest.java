package com.seleniumJava.letznav;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	@Test(description="sample Tests")
	public void f() {
		int result = 20;
		boolean fix = false;
		if (result % 2 == 0) {
			fix = true;
		} else {
			fix = false;
		}
		Assert.assertTrue(fix);

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class letznav");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class letznav");
	}

}
