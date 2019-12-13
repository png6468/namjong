package com.min.edu.dto;

import java.io.Serializable;

public class StuAvgSel_Dto implements Serializable{

	private static final long serialVersionUID = -1489230883036522975L;
	private String sub_Code;
	private String sub_name;
	private String sub_time;
	private String jumsu;
	public StuAvgSel_Dto() {
		// TODO Auto-generated constructor stub
	}
	public StuAvgSel_Dto(String sub_Code, String sub_name, String sub_time, String jumsu) {
		super();
		this.sub_Code = sub_Code;
		this.sub_name = sub_name;
		this.sub_time = sub_time;
		this.jumsu = jumsu;
	}
	@Override
	public String toString() {
		return "StuAvgSel_Dto [sub_Code=" + sub_Code + ", sub_name=" + sub_name + ", sub_time=" + sub_time + ", jumsu="
				+ jumsu + "]";
	}
	public String getSub_Code() {
		return sub_Code;
	}
	public void setSub_Code(String sub_Code) {
		this.sub_Code = sub_Code;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public String getSub_time() {
		return sub_time;
	}
	public void setSub_time(String sub_time) {
		this.sub_time = sub_time;
	}
	public String getJumsu() {
		return jumsu;
	}
	public void setJumsu(String jumsu) {
		this.jumsu = jumsu;
	}
	
	
}
