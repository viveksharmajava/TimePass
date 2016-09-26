package com.timePass.exception;



/**
 * The Class ExternalPricingServiceException.
 * 
 * @author Vivek Sharma
 */
public class ExternalPricingServiceException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6854945379036729034L;
	
	/** The exception type. */
	private int exceptionType = 0;
	
	/** The message code. */
	private String messageCode = null;



	/**
	 * Sets the message code.
	 * 
	 * @param messageCode the new message code
	 */
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	/**
	 * Instantiates a new pricing service exception.
	 */
	public ExternalPricingServiceException() {
		super();
	}
	
	/**
	 * Instantiates a new pricing service exception.
	 * 
	 * @param messageCode the message code
	 */
	public ExternalPricingServiceException(String messageCode) {
		super();
		this.messageCode = messageCode;
	}

	/**
	 * Instantiates a new pricing service exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public ExternalPricingServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new pricing service exception.
	 * 
	 * @param cause the cause
	 */
	public ExternalPricingServiceException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * Instantiates a new pricing service exception.
	 * 
	 * @param exceptionType the exception type
	 */
	public ExternalPricingServiceException(int exceptionType) {
		super();
		this.exceptionType = exceptionType;
	}
	
	/**
	 * Instantiates a new pricing service exception.
	 * 
	 * @param exceptionType the exception type
	 * @param message the message
	 */
	public ExternalPricingServiceException(int exceptionType, String message) {
		super(message);
		this.exceptionType = exceptionType;
	}
	
	/**
	 * Instantiates a new pricing service exception.
	 * 
	 * @param exceptionType the exception type
	 * @param message the message
	 * @param messageCode the message code
	 */
	public ExternalPricingServiceException(int exceptionType, String message, String messageCode) {
		super(message);
		this.messageCode = messageCode;
		this.exceptionType = exceptionType;
	}
	
	/**
	 * Gets the exception type.
	 * 
	 * @return the exception type
	 */
	public int getExceptionType() {
		return exceptionType;
	}
	
	/**
	 * Sets the exception type.
	 * 
	 * @param exceptionType the new exception type
	 */
	public void setExceptionType(int exceptionType) {
		this.exceptionType = exceptionType;
	}
	
	/**
	 * Gets the message code.
	 * 
	 * @return the message code
	 */
	public String getMessageCode() {
		return messageCode;
	}

}
