package com.floatbackwards.statuscodes.service;

import javax.ws.rs.core.Response;

import com.floatbackwards.statuscodes.HttpStatus;

public class HttpStatusCodesServiceBean implements HttpStatusCodesServiceResource {

	public Response getStatus(String statusCode) {
		HttpStatus httpStatus = HttpStatus.getByCode(statusCode);
		return Response.status(httpStatus.getCode())
				.entity(String.format("Http Status: %s", httpStatus.getName()))
				.build();
	}
	
	
}
