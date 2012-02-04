package com.floatbackwards.statuscodes.service;

import javax.ws.rs.core.Response;

public class HttpStatusCodesServiceBean implements HttpStatusCodesServiceResource {

	public Response getStatus(String statusCode) {
		return Response.status(Integer.parseInt(statusCode))
				.entity(String.format("Http Status: %s", statusCode))
				.build();
	}
	
}
