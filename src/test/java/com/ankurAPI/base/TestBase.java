package com.ankurAPI.base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ankurAPI.utilities.HtmlReport;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static com.ankurAPI.utilities.Constants.BASE_URL;
import static com.ankurAPI.utilities.Constants.GET_AVAILABLE_PET;

import java.util.Date;

import java.util.Map;
public class TestBase {

	public static RequestSpecification httpRequest;
	public static Response response;
	public  Logger logger;
	public static String testName = "";

	@BeforeSuite
	public void setup() {
		logger = logger.getLogger(getClass());
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	}

	public void getAvailability() throws InterruptedException{
		RestAssured.baseURI = BASE_URL;
		RestAssured.useRelaxedHTTPSValidation();
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET,GET_AVAILABLE_PET);
		Thread.sleep(2);
	}

	public void post() throws InterruptedException{
		RestAssured.baseURI = BASE_URL;
		RestAssured.useRelaxedHTTPSValidation();
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET,GET_AVAILABLE_PET);
		Thread.sleep(2);
	}

	@AfterClass
	public void teardown() {
		logger.info("*****************Finished Test Case execution method *******************");
	}

	@AfterSuite
	public void afterSuiteMethod() throws ArithmeticException {
		logger.info("****Started afterSuiteMethod *******");
		//HtmlReport.setHtml();
	}
}
