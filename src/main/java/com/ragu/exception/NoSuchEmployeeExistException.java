package com.ragu.exception;

public class NoSuchEmployeeExistException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private final String errorMessage;

	

	public NoSuchEmployeeExistException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage()
	{
		return errorMessage;
	}
	public long getErrorSerialID()
	{
		return serialVersionUID;
	}

	
}
