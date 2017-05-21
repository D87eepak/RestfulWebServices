package com.rest.model;

public class ErrorMessage {

	private String message;
	private String description;
	private String errorCode;
	
	public ErrorMessage(){
		
	}
	public ErrorMessage(String message,String description,String errorCode){
		this.message=message;
		this.errorCode=errorCode;
		this.description=description;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
