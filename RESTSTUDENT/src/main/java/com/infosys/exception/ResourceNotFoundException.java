package com.infosys.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@AllArgsConstructor
public class ResourceNotFoundException extends RuntimeException{


	public static final long serialVersionUID = 1L;

	
	 public ResourceNotFoundException(String message) {
	        super(message);
	    }
}