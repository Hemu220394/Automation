package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {

	@Test//(enabled = false)// USE TO DISABLE THE TEST CASE 
	public void demo() {
		Reporter.log("hi",true);
		Assert.fail();// USE TO FAILED THE TEST CASE INTENTIONALLY
	}
}
