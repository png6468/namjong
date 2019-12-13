package com.min.edu.dto;

import java.io.Serializable;

public class AnswerScore_Dto implements Serializable{

	private static final long serialVersionUID = 4397245985885933579L;
	private String ans_seq;
	private String curexa_code;
	private String stu_id;
	private String answer;
	private String newfilename;
	private String check;
	private String jumsu;
	public AnswerScore_Dto() {
		// TODO Auto-generated constructor stub
	}
	public AnswerScore_Dto(String ans_seq, String curexa_code, String stu_id, String answer, String newfilename,
			String check, String jumsu) {
		super();
		this.ans_seq = ans_seq;
		this.curexa_code = curexa_code;
		this.stu_id = stu_id;
		this.answer = answer;
		this.newfilename = newfilename;
		this.check = check;
		this.jumsu = jumsu;
	}
	@Override
	public String toString() {
		return "AnswerScore_Dto [ans_seq=" + ans_seq + ", curexa_code=" + curexa_code + ", stu_id=" + stu_id
				+ ", answer=" + answer + ", newfilename=" + newfilename + ", check=" + check + ", jumsu=" + jumsu + "]";
	}
	public String getAns_seq() {
		return ans_seq;
	}
	public void setAns_seq(String ans_seq) {
		this.ans_seq = ans_seq;
	}
	public String getCurexa_code() {
		return curexa_code;
	}
	public void setCurexa_code(String curexa_code) {
		this.curexa_code = curexa_code;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getNewfilename() {
		return newfilename;
	}
	public void setNewfilename(String newfilename) {
		this.newfilename = newfilename;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getJumsu() {
		return jumsu;
	}
	public void setJumsu(String jumsu) {
		this.jumsu = jumsu;
	}
	
	
	
	
}
