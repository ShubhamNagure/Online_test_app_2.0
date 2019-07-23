package com.test.service;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.test.bean.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {
	
	@Query(value="SELECT u FROM Users u WHERE u.email LIKE '%' || :email || '%'")
	public List<Users> getPasswordByEmail(@Param("email") String email);
	
	

}
