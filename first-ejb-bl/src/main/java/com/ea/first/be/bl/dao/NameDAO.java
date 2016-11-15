package com.ea.first.be.bl.dao;

import java.util.List;

import com.ea.first.be.api.dto.NameDTO;

public interface NameDAO {	

	NameDTO get(Long id);

	void insert(NameDTO record);
	
	void update(NameDTO record);
	
	void delete(Long id);

	List<NameDTO> getAll();
	
}
