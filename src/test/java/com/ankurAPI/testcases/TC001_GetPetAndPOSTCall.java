package com.ankurAPI.testcases;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import junit.framework.Assert;
import com.ankurAPI.base.TestBase;

import java.util.List;


public class TC001_GetPetAndPOSTCall extends TestBase {

	@BeforeClass
	void setCustomerAndContractDetailsForFirstTime() throws InterruptedException {
		getAvailability();
	}

	@Test(priority = 0, description = "to verify response from get pet available")
	void getCustomerDetailsAPI_VerifyResponseBodyForPrime() {
		logger.info(" ****************** TC001_Get Pet Available*******************");

		String responseBody = response.getBody().asString();
		Assert.assertTrue(responseBody != null);
		Assert.assertEquals(true, responseBody.contains("name"));
		Assert.assertEquals(true, responseBody.contains("status"));
		Assert.assertEquals(true, responseBody.contains("available"));
		logger.info(" ******************End of TC001_Get Pet Available *******************");
	}

	@Test(priority = 1, description = "to verify response of post call")
	void getCustomerDetailsAPI_val8() throws InterruptedException {
		List<String> pathvalue = response.getBody().jsonPath().getList(""); // will get the path we want to validate
		boolean isPetpresent = pathvalue.isEmpty();
		//Assert.assertTrue(responseBody != null);
		Assert.assertEquals(true, isPetpresent);
	}
}
