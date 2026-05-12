package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.utils.RetryAnalyzer;

//commit-3
//commit-4

public class Testcases {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void TC1() {
		Assert.assertFalse(true);

		//this is live demo from main branch for conflict issues
	}

}
