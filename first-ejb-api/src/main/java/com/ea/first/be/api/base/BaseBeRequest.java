package com.ea.first.be.api.base;

/**
 * The First Base Request, this class manage metadata
 */
public class BaseBeRequest implements BeRequest {

	private static final long serialVersionUID = 5113534465822277419L;

	private RequestMetaData requestMetaData = null;

	@Override
	public RequestMetaData getMetadata() {
		return requestMetaData;
	}

	@Override
	public void setMetadata(RequestMetaData requestMetaData) {
		this.requestMetaData = requestMetaData;

	}

}
