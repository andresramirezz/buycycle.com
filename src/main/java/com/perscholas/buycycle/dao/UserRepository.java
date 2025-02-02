/**
 * @author Andres Ramirez
 * File: UserRepository.java
 * Date 02/29/2020
 * 
 */

package com.perscholas.buycycle.dao;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.perscholas.buycycle.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	public Optional<User> findByUsername(String username);
}
