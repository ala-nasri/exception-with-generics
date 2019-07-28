package com.nasri.rest.exceptions;

public class ClientException extends BaseException{
	
	
	public ClientException(ClientError error) {
		super(error);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum ClientError implements BaseError<ClientException> {
		CLIENT_ERROR(404);
		
		private int code;

		ClientError(int code) {
			this.code = code;
		}

		@Override
		public int getCode() {
			return code ;
		}

		@Override
		public String getName() {
			return name();
		}

	}

}
