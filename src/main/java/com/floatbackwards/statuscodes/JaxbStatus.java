package com.floatbackwards.statuscodes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Object to handle the marshaling of our HttpStatus objects from json / xml
 * etc. This is required as we cannot get the instance variables to map
 * correctly when attempting to marshal directly using the enum.
 * <p>
 * Note that the instance variables are mutable as jaxb requires that we declare
 * an empty default constructor. In order to restrict access this constructor is
 * set to private and no accessors are defined for the mutable members. We could
 * also get around this by using an @{link XmlAdapter} but this seems like
 * overkill in this case.
 * 
 * @author Ben Griffiths
 * 
 */
@XmlRootElement(name = "HttpStatus")
public class JaxbStatus {

	private HttpStatus httpStatus;

	/**
	 * Creates a new JaxbStatus object from the supplied HttpStatus
	 * 
	 * @param httpStatus
	 *            the HttpStatus that our JaxbStatus object will represent
	 */
	public JaxbStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	@SuppressWarnings("unused")
	private JaxbStatus() {
		// required by jaxb
	}

	/**
	 * Returns the http status code
	 * 
	 * @return the http status code
	 */
	@XmlElement
	public final int getCode() {
		return httpStatus.getCode();
	}

	/**
	 * Returns the http status name
	 * 
	 * @return the http status name
	 */
	@XmlElement
	public final String getName() {
		return httpStatus.getName();
	}

	/**
	 * Returns the http status description
	 * 
	 * @return the http status description
	 */
	@XmlElement
	public final String getDescription() {
		return httpStatus.getDescription();
	}

}
