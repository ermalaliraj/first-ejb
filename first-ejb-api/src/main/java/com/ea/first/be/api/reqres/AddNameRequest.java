package com.ea.first.be.api.reqres;

import com.ea.first.be.api.base.BaseBeRequest;
import com.ea.first.be.api.dto.NameDTO;

public class AddNameRequest extends BaseBeRequest {

	private static final long serialVersionUID = 138061599685344797L;
	
	private NameDTO input;

	public NameDTO getInput() {
		return input;
	}

	public void setInput(NameDTO input) {
		this.input = input;
	}

}
