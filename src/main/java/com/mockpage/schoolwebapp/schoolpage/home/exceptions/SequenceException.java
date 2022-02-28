package com.mockpage.schoolwebapp.schoolpage.home.exceptions;

public class SequenceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SequenceException() {
		super();
	}

	public SequenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SequenceException(String message, Throwable cause) {
		super(message, cause);
	}

	public SequenceException(String message) {
		super(message);
	}

	public SequenceException(Throwable cause) {
		super(cause);
	}
}
