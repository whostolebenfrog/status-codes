package com.floatbackwards.statuscodes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="HttpStatus")
public class JaxbStatus {
	
	private int code;
	private String name;
	private String description;

	public JaxbStatus (HttpStatus httpStatus) {
		this.code = httpStatus.getCode();
		this.name = httpStatus.getName();
		this.description = httpStatus.getDescription();
	}
	
	public JaxbStatus() {
		
	}

	@XmlElement
	public final int getCode() {
		return code;
	}

	@XmlElement
	public final String getName() {
		return name;
	}

	@XmlElement
	public final String getDescription() {
		return description;
	}

}
