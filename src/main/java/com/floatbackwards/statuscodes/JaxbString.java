package com.floatbackwards.statuscodes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JaxbString {

	private String value;
	private String name;

	public JaxbString() {
	}

	public JaxbString(String name, String value) {
		this.value = value;
		this.name = name;
	}

	@XmlElement
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
