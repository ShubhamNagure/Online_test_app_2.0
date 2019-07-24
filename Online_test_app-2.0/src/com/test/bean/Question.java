package com.test.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long qid;
	
	private String ques;
	private String ans;
	private String option1,option2,option3,option4;
	private String ques_type;
	
	public Question() {
		
	}
	public Long getQid() {
		return qid;
	}
	public void setQid(Long qid) {
		this.qid = qid;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getQues_type() {
		return ques_type;
	}
	public void setQues_type(String ques_type) {
		this.ques_type = ques_type;
	}
	
	
	
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", ques=" + ques + ", ans=" + ans + ", ques_type=" + ques_type + "]";
	}
	

}
