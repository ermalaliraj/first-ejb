package com.ea.first.be.api.dto;

import java.io.Serializable;
import java.util.List;

public class GetAllNamesOutputDTO implements Serializable{
	
	private static final long serialVersionUID = -1315912518023391791L;
	
	private List<NameDTO> names;
	
	public GetAllNamesOutputDTO() {}
	
	public GetAllNamesOutputDTO(List<NameDTO> names) {
		this.names = names;
	}

	public List<NameDTO> getNames() {
		return names;
	}
	
	public void setNames(List<NameDTO> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer() ;
		for (NameDTO r : this.names) {
			result.append(r);
			result.append("; ");
		}
		return result.toString();
	}
	
}
