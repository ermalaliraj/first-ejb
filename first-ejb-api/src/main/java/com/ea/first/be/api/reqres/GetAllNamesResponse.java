package com.ea.first.be.api.reqres;

import com.ea.first.be.api.base.BaseBeResponse;
import com.ea.first.be.api.dto.GetAllNamesOutputDTO;

public class GetAllNamesResponse extends BaseBeResponse<GetAllNamesOutputDTO>{

	private static final long serialVersionUID = 1557880220955761298L;

	private GetAllNamesOutputDTO result;
	
	@Override
	public GetAllNamesOutputDTO getResult() {
		return result;
	}

	@Override
	public void setResult(GetAllNamesOutputDTO result) {
		this.result = result;
		
	}
}
