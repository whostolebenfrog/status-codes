package com.floatbackwards.statuscodes.service;

import java.util.Collection;

import javax.ws.rs.core.Response;

import com.floatbackwards.statuscodes.HttpStatus;
import com.floatbackwards.statuscodes.JaxbStatus;

public class HttpStatusCodesServiceBean implements HttpStatusCodesServiceResource {

	public Response getStatus(String statusCode) {
		HttpStatus httpStatus = HttpStatus.getByCode(statusCode);
		return Response.status(httpStatus.getCode())
				.entity(httpStatus.toJsonString())
				.build();
	}

	public Collection<JaxbStatus> getAllStatuses() {
		return HttpStatus.getJaxbValues();
	}
	
}
