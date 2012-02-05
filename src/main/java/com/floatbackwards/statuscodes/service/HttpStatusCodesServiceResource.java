package com.floatbackwards.statuscodes.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public interface HttpStatusCodesServiceResource {

	@GET
	@Path("/code/{statusCode}")
	@Produces("application/json") 
	public Response getStatus(@PathParam("statusCode") String statusCode);
	
}
