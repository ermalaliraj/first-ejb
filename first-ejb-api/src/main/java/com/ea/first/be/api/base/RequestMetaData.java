package com.ea.first.be.api.base;

/**
 * All Rest input parameters will extend this MetaData class
 */
public class RequestMetaData implements ContextValue {

	private static final long serialVersionUID = -2644318650677105255L;

	private String ip = "";
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public Object[] getFields() {
		return new Object[] { getIp()};
	}

	@Override
	public int getWeight() {
		return 100;
	}


}
