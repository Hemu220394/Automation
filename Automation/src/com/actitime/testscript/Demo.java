package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	// PRIORITY IS USED TO EXECUTE THE TEST METHOD IN REQUIRED ORDER
	
	// INVOCATION COUNT IS USED TO RUN A METHOD MULTIPLE TIME
	@Test(priority = 1,invocationCount = 1)
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(priority = 3)
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	//DEPENDS METHOD IS USED TO MAKE A TEST DEPENDS ON ANOTHER TEST
	@Test(priority = 2,dependsOnMethods = "modifyCustomer")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer");
	}
}
