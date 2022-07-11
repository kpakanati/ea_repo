package com.equifax.www.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDetails {
	@JsonProperty("status")
	private String status;
	@JsonProperty("data")
	private Data data;
	@JsonProperty("message")
	private String message;
}
