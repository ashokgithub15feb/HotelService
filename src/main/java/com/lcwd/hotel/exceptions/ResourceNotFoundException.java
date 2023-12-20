package com.lcwd.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3796351923400638920L;

	public ResourceNotFoundException() {
		super("Resource not found on server !!");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
