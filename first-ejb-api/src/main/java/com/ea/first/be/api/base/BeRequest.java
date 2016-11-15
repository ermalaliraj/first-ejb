package com.ea.first.be.api.base;

import java.io.Serializable;

/**
 * Interface that ALL Backend DTO must implements.
 * The contract for these classes is that the object returned by the GET method
 * is NEVER NULL and should be filled by the creator
 * 
 */
public interface BeRequest extends Serializable {

	RequestMetaData getMetadata();

	void setMetadata(RequestMetaData requestMetaData);

}
