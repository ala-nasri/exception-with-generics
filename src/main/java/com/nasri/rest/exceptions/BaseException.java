package com.nasri.rest.exceptions;

public abstract class BaseException extends Exception {
	
	
	private BaseError<?> error;

	public <T extends BaseError<?>> BaseException(T error) {
		super();
		this.error = error;
	}
	
	public final BaseError<?> getError() {
		return this.error;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public interface BaseError<T extends BaseException>{
		int getCode();
		String getName();
	}
}
