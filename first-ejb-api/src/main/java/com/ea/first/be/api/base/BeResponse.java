package com.ea.first.be.api.base;

import java.io.Serializable;

/**
 * Interface that ALL Backend DTO must implements. <BR/>
 * The contract for these classes is that the object returned by the GET method
 * is NEVER NULL and should be filled by the creator
 * 
 * @param <T>
 */
public interface BeResponse<T> extends Serializable {

	T getResult();
	void setResult(T result);

	public ResponseMetaData getResponseMetaData();
	public void setResponseMetaData(ResponseMetaData responseMetaData);

}