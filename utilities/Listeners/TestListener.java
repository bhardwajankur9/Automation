package com.ankurAPI.utilities.Listeners;

import com.ankurAPI.base.TestBase;
import com.ankurAPI.utilities.ExtentReports.ExtentManager;
import com.ankurAPI.utilities.ExtentReports.ExtentTestManager;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import java.util.HashMap;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends TestBase implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
		testName = context.getName();
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		ExtentTestManager.startTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {

		ExtentTestManager.getTest().log(Status.PASS, MarkupHelper.createLabel("Test Case: " +result.getMethod().getDescription() + ": PASSED", ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {

		ExtentTestManager.getTest().log(Status.FAIL, result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		//System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
	//	result.getTestContext().getFailedTests().getResults(result.getMethod()).
		ExtentTestManager.getTest().log(Status.SKIP,result.getThrowable().toString());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}

}