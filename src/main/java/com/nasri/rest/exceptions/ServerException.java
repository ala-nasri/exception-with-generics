package com.nasri.rest.exceptions;

public class ServerException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServerException(BaseError<ServerException> error) {
		super(error);
	}

	public enum ServerError implements BaseError<ServerException> {
		SERVER_ERROR(500);

		private int code;
		private ServerError(int code) {
			this.code = code;
		}
		@Override
		public int getCode() {
			return code;
		}

		@Override
		public String getName() {
			return name();
		}
		

	}

}
