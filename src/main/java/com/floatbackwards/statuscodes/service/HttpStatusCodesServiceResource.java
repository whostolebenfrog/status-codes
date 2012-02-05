package com.floatbackwards.statuscodes.service;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.floatbackwards.statuscodes.JaxbStatus;

@Path("/")
public interface HttpStatusCodesServiceResource {
	
	static final String JSON = "application/json";

	@GET
	@Path("/codes/{statusCode}")
	@Produces(JSON) 
	Response getStatus(@PathParam("statusCode") String statusCode);
	
	@GET
	@Path("/codes/list")
	@Produces(JSON)
	Collection<JaxbStatus> getAllStatuses();
	
}
