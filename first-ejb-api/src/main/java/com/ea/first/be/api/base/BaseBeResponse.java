package com.ea.first.be.api.base;



/**
 * The Be Base Response, this class manage metadata
 *
 * @Param <T>
 */
public abstract class BaseBeResponse<T> implements BeResponse<T> {

	private static final long serialVersionUID = 1L;

	private ResponseMetaData responseMetaData = null;

	@Override
	public ResponseMetaData getResponseMetaData() {
		return responseMetaData;
	}
	@Override
	public void setResponseMetaData(ResponseMetaData responseMetaData) {
		this.responseMetaData = responseMetaData;
	}

	/**
	 * used to convert the results from a list to an array, in order to be compatible with JAX-WS
	 * @param myType the class of the results
	 * @param entities a list of results
	 * @return the result in a suitable format for JAX-WS
	 */
//	protected T[] convertListResults(Class<T> myType, List<T> entities) {
//		return CommonUtils.listToArray(myType, entities, true);
//	}

}
