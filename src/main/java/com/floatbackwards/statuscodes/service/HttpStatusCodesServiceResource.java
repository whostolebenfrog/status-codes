package com.floatbackwards.statuscodes.service;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.floatbackwards.statuscodes.HttpStatus;
import com.floatbackwards.statuscodes.JaxbStatus;

/**
 * Defines the jax-rs rest interface for getting HTTP status codes
 * 
 * @author Ben Griffiths
 * 
 */
@Path("/http-status/")
public interface HttpStatusCodesServiceResource {

	static final String JSON = "application/json";

	/**
	 * Returns a {@link Response} object with the supplied HTTP status code and
	 * json body detailing the request information
	 * 
	 * @param statusCode
	 *            the status code we will return
	 * @return a response with the supplied status code
	 */
	@GET
	@Path("/codes/{statusCode}")
	@Produces(JSON)
	Response getStatus(@PathParam("statusCode") String statusCode);

	/**
	 * Lists all available {@link HttpStatus} objects.
	 * 
	 * @return a list of all available {@link HttpStatus} objects
	 */
	// @AddLinks
	// @LinkResource(pathParameters = { "${HttpStatus.code}" })
	@GET
	@Path("/codes/list")
	@Produces(JSON)
	Collection<JaxbStatus> getAllStatuses();

}
