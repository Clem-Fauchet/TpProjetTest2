package com.tactfactory.monprojetsb2.monprojetsb2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface JpaRepository extends CrudRepository<User, Long> {

	List<User> findByLastName(String lastName);

	List<User> findByFirstName(String firstName);

	JpaRepository findById(long id);
}
