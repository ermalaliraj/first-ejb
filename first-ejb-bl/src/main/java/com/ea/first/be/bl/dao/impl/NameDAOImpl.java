package com.ea.first.be.bl.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ea.first.be.api.dto.NameDTO;
import com.ea.first.be.bl.dao.GenericDAO;
import com.ea.first.be.bl.dao.NameDAO;
import com.ea.first.be.bl.dao.jpql.CatalogoJpql;
import com.ea.first.be.bl.entity.NameEntity;

@Repository
public class NameDAOImpl extends GenericDAO implements NameDAO {

	@Override
	public NameDTO get(Long id) {
		return entityManager.find(NameDTO.class, id);
	}
	
	@Override
	public void insert(NameDTO record) {
		NameEntity e = new NameEntity();
		e.setName(record.getName());
		entityManager.persist(e);
	}
	
	@Override
	public void update(NameDTO record) {
		NameEntity e = new NameEntity();
		e.setName(record.getName());
		entityManager.merge(e);
	}

	@Override
	public void delete(Long id) {
		NameEntity toBeRemoved = entityManager.getReference(NameEntity.class, id);
		entityManager.remove(toBeRemoved);
	}

	@Override
	public List<NameDTO> getAll() {
		@SuppressWarnings("unchecked")
		List<NameEntity> list = entityManager.createQuery(CatalogoJpql.getQuery_GetAllNames())
                		.getResultList();
		
		List<NameDTO> dtoList = new ArrayList<NameDTO>();
		NameDTO dto;
		for (NameEntity e : list) {
			dto = new NameDTO();
			dto.setId(e.getId());
			dto.setName(e.getName());
			dtoList.add(dto);
		}
		
		return dtoList;
	}
	
}
