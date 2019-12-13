package com.min.edu.dto;

import java.io.Serializable;

public class StuCouSel_Dto implements Serializable{

	private static final long serialVersionUID = -2780450203450167315L;
	private String scseq;
	private String stu_id;
	private String tea_id;
	private String cou_name;
	private String cou_exp;
	public StuCouSel_Dto() {
		// TODO Auto-generated constructor stub
	}
	public StuCouSel_Dto(String scseq, String stu_id, String tea_id, String cou_name, String cou_exp) {
		super();
		this.scseq = scseq;
		this.stu_id = stu_id;
		this.tea_id = tea_id;
		this.cou_name = cou_name;
		this.cou_exp = cou_exp;
	}
	@Override
	public String toString() {
		return "StuCouSel_Dto [scseq=" + scseq + ", stu_id=" + stu_id + ", tea_id=" + tea_id + ", cou_name=" + cou_name
				+ ", cou_exp=" + cou_exp + "]";
	}
	public String getScseq() {
		return scseq;
	}
	public void setScseq(String scseq) {
		this.scseq = scseq;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getTea_id() {
		return tea_id;
	}
	public void setTea_id(String tea_id) {
		this.tea_id = tea_id;
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
	
	
}
