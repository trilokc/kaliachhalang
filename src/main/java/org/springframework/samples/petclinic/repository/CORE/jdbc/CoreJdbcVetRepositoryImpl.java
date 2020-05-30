package org.springframework.samples.petclinic.repository.CORE.jdbc;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.repository.VetRepository;

public class CoreJdbcVetRepositoryImpl implements VetRepository { 

	@Override
	public Collection<Vet> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vetB() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
