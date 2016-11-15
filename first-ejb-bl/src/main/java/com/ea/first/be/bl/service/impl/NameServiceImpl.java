package com.ea.first.be.bl.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ea.first.be.api.dto.NameDTO;
import com.ea.first.be.bl.dao.NameDAO;
import com.ea.first.be.bl.service.NameService;

@Service("nameService")
public class NameServiceImpl implements NameService {
	
	protected static transient Log logger = LogFactory.getLog(NameServiceImpl.class);
	
	@Autowired
	private NameDAO nameDAO;
	
	@Override
	public List<NameDTO> getAllNames() {
		return nameDAO.getAll();
	}

	@Override
	public void addName(NameDTO input) {
		nameDAO.insert(input);
	}

}
