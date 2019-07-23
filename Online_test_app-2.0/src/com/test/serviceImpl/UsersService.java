package com.test.serviceImpl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.Users;
import com.test.service.UsersRepository;

 

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository repo;
	
	public void save(Users user) {
		repo.save(user);
	}
	
	public boolean isAuthorised(String email,String pass) {
		boolean flag=false;
		String passFromDb = "";
		List<Users> list=repo.getPasswordByEmail(email);	
		Iterator<Users> i=list.iterator();
		while (i.hasNext()) {
			Users us = (Users) i.next();
			passFromDb=us.getPassword();	
		}
			if(passFromDb.equals(pass)) {
			flag=true;			
			}
		return flag;
	}
	
	public boolean checkAdmin(String email,String pass) {
		boolean flag=false;
		String em="admin@gmail.com";
		String pa="admin";
		if(email.equals(em) && pass.equals(pa)) {
			flag=true;
		}
		return flag;
	}
	

}
