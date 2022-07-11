package com.equifax.www.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data {
	private String id;
	private String employee_name;
	private String employee_salary;
	private String employee_age;
	private String profile_image;
}
