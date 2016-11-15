package com.ea.first.be.api.base;

import java.io.Serializable;

/**
 * All Rest output parameters will extend this MetaData class 
 *
 */
public class ResponseMetaData implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 0100'
	 */
	private String outputCommonDataVersion = "";
	/**
	 * La gestione standard dello status in questo componente di Input e': 1:
	 * valorizzato dal chiamante durante la chiamata all'OSB che wrappa il
	 * servizio; 2: valorizzato dal componente OSB prima della chiamata al
	 * servizio sottostante (es: WS, SCA component,..)
	 */
	private int statusCode = 0;
	
	public String getOutputCommonDataVersion() {
		return outputCommonDataVersion;
	}
	
	public void setOutputCommonDataVersion(String outputCommonDataVersion) {
		this.outputCommonDataVersion = outputCommonDataVersion;
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
		
}
