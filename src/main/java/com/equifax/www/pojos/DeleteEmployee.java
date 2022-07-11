package com.equifax.www.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteEmployee {
	@JsonProperty("status")
	private String status;
	@JsonProperty("data")
	private String data;
	@JsonProperty("message")
	private String message;
}
