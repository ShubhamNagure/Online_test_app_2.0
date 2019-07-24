package com.test.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.test.bean.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {
	
	/*@Query(value="SELECT q FROM question q WHERE q.ques LIKE '%' || :ques || '%'")
	public List<Question> getListofAnswer(@Param("qid") String question);*/
	
}
