package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.utils.RetryAnalyzer;

public class Testcases {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void TC1() {
		Assert.assertFalse(true);

		//this is live demo from feature branch for conflict issues
	}

}
