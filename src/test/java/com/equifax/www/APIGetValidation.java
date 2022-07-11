package com.equifax.www;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.equifax.www.pojos.Data;
import com.equifax.www.pojos.EmployeeDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.io.IOException;
public class APIGetValidation {
	@Test
	public void testgetMethod() throws IOException {
		ReadProperty readProperties=new ReadProperty();
		RestAssured.baseURI=readProperties.getProperty("baseURL");
		Response response = given().when().get(readProperties.getProperty("employeeAPIURL").replace("<employeeId>",readProperties.getProperty("employeeId")));
		Assert.assertEquals(response.getStatusCode(), 200,"Incorrect status code");
		System.out.println(response.getBody().asString());
		ObjectMapper obj=new ObjectMapper();
		EmployeeDetails employeeDetails=obj.readValue(response.getBody().asString(), EmployeeDetails.class);
		Assert.assertEquals(employeeDetails.getData().getEmployee_name(), readProperties.getProperty("employeeName"),"Incorrect employee name");
	}

}
