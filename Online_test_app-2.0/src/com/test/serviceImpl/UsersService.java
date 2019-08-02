package com.test.serviceImpl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.Question;
import com.test.bean.Users;
import com.test.service.QuestionRepository;
import com.test.service.UsersRepository;

 

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository repo;
	@Autowired
	private QuestionRepository qrepo;
	
	public void save(Users user) {
		repo.save(user);
	}
	
	public boolean isAuthorised(String email,String pass) {
		boolean flag=false;
		String passFromDb = "";
		
		List<Users> list=repo.getPasswordByEmail(email);	
		Iterator<Users> i=list.iterator();
		if(email.isEmpty() && pass.isEmpty()) {
			flag=false;
			}else {
				while (i.hasNext()) {
					Users us = (Users) i.next();
					passFromDb=us.getPassword();	
				}
					if(passFromDb.equals(pass)) {
					flag=true;			
				}	else {
					
					flag=false;
				}
		}
		return flag;
	}
	
	public boolean checkAdmin(String email,String pass) {
		boolean flag=false;
		String em="admin@gmail.com";//Hard code is not recommended.
		String pa="admin";
		if(email.equals(em) && pass.equals(pa)) {
			flag=true;
		}
		return flag;
	}
	public List<Question> questionList(){
		
		
		return (List<Question>) qrepo.findAll();
		

		 
		
	}
	/*public boolean isCorrectAnswer(Long qid,String op) {
		boolean flag=false;
		String op1="",op2="",op3="",op4="";
		Long quesid = null;
		List<Question> list=qrepo.getListofAnswer(qid);
		Iterator<Question> i=list.iterator();
		while (i.hasNext()) {
			Question q = (Question) i.next();
				quesid=q.getQid();
				op1=q.getOption1();
				op2=q.getOption2();
				op3=q.getOption3();
				op4=q.getOption4();
			
		}
		if (qid==quesid) {
			if (op==op4) {
				flag=true;
			}else {
				flag=false;
			}
			return flag;
		}
		return flag;
	}*/
	
	
	
	

}
