package org.springframework.samples.petclinic.repository.CORE.jdbc;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.repository.PetRepository;

public class CoreJdbcPetRepositoryImpl implements PetRepository {

	@Override
	public List<PetType> findPetTypes() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pet findById(int id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Pet pet) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> vastuoaap() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
