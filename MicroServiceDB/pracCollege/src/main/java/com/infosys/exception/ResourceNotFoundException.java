package com.infosys.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public String resourcename;
	public String fieldname;
	public Object fieldvalue;
	
	public ResourceNotFoundException(String resourcename, String fieldname, Object fieldvalue) {
		super(String.format("%s not found with %s : %s", resourcename,fieldname,fieldvalue));
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}

	public String getResourcename() {
		return resourcename;
	}

	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}

	public String getFieldname() {
		return fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public Object getFieldvalue() {
		return fieldvalue;
	}

	public void setFieldvalue(Object fieldvalue) {
		this.fieldvalue = fieldvalue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}