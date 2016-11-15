package com.ea.first.be.api.reqres;

import java.io.Serializable;


public class AddNameResponse implements Serializable {

	private static final long serialVersionUID = 1557880220955761298L;

	private Integer result;

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
	
	
}
