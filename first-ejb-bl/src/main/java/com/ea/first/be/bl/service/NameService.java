package com.ea.first.be.bl.service;

import java.util.List;

import com.ea.first.be.api.dto.NameDTO;

public interface NameService {

	public List<NameDTO> getAllNames();

	public void addName(NameDTO input);

}
