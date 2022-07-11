package com.equifax.www;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.equifax.www.pojos.DeleteEmployee;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIDeletevalidation {
	@Test
	public void testgetMethod() throws IOException {
		ReadProperty readProperties=new ReadProperty();
		RestAssured.baseURI=readProperties.getProperty("baseURL");
		Response response = given().when().delete(readProperties.getProperty("employeeDeleteURL").replace("<id>",readProperties.getProperty("deleteId")));
		Assert.assertEquals(response.getStatusCode(), 200,"Incorrect status code");
		System.out.println(response.getBody().asString());
		ObjectMapper obj=new ObjectMapper();
		DeleteEmployee deleteEmployee=obj.readValue(response.getBody().asString(), DeleteEmployee.class);
		Assert.assertEquals(deleteEmployee.getMessage(), readProperties.getProperty("sucessfulDeleteMessage"));
	}

}
