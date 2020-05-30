package org.springframework.samples.petclinic.repository.CORE.jdbc;

import java.util.Collection;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;

public class CoreJdbcOwnerRepositoryImpl implements OwnerRepository {

	@Override
	public Collection<Owner> findByLastName(String lastName) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner findById(int id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Owner owner) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Owner> maxPetsByOwner() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> ownersByPetType(String petId) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
