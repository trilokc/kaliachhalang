package org.springframework.samples.petclinic.repository.CORE.jdbc;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.VisitRepository;

public class CoreJdbcVisitRepositoryImpl implements VisitRepository { 

	@Override
	public void save(Visit visit) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Visit> findByPetId(Integer petId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
