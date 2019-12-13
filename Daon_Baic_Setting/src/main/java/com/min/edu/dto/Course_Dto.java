package com.min.edu.dto;

import java.io.Serializable;

public class Course_Dto implements Serializable{

	private static final long serialVersionUID = -8909009139142490509L;
	private String cou_code;
	private String teacher_id;
	private String cou_name;
	private String cou_exp;
	private String startdate;
	private String totaltime;
	private String state;
	private String enddate;
	private String cou_cnt;
	public Course_Dto() {
		// TODO Auto-generated constructor stub
	}
	public Course_Dto(String cou_code, String teacher_id, String cou_name, String cou_exp, String startdate,
			String totaltime, String state, String enddate, String cou_cnt) {
		super();
		this.cou_code = cou_code;
		this.teacher_id = teacher_id;
		this.cou_name = cou_name;
		this.cou_exp = cou_exp;
		this.startdate = startdate;
		this.totaltime = totaltime;
		this.state = state;
		this.enddate = enddate;
		this.cou_cnt = cou_cnt;
	}
	@Override
	public String toString() {
		return "Course_Dto [cou_code=" + cou_code + ", teacher_id=" + teacher_id + ", cou_name=" + cou_name
				+ ", cou_exp=" + cou_exp + ", startdate=" + startdate + ", totaltime=" + totaltime + ", state=" + state
				+ ", enddate=" + enddate + ", cou_cnt=" + cou_cnt + "]";
	}
	public String getCou_code() {
		return cou_code;
	}
	public void setCou_code(String cou_code) {
		this.cou_code = cou_code;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getCou_name() {
		return cou_name;
	}
	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}
	public String getCou_exp() {
		return cou_exp;
	}
	public void setCou_exp(String cou_exp) {
		this.cou_exp = cou_exp;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getTotaltime() {
		return totaltime;
	}
	public void setTotaltime(String totaltime) {
		this.totaltime = totaltime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getCou_cnt() {
		return cou_cnt;
	}
	public void setCou_cnt(String cou_cnt) {
		this.cou_cnt = cou_cnt;
	}
	
	
	
	
}
