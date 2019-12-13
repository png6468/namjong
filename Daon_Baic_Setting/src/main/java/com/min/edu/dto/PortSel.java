package com.min.edu.dto;

public class PortSel {

	private String exa_code; 
	private String curexa_code; 
	private String cur_code; 
	private String content; 
	private String standard;
	public PortSel() {
		// TODO Auto-generated constructor stub
	}
	public PortSel(String exa_code, String curexa_code, String cur_code, String content, String standard) {
		super();
		this.exa_code = exa_code;
		this.curexa_code = curexa_code;
		this.cur_code = cur_code;
		this.content = content;
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "PortSel [exa_code=" + exa_code + ", curexa_code=" + curexa_code + ", cur_code=" + cur_code
				+ ", content=" + content + ", standard=" + standard + "]";
	}
	public String getExa_code() {
		return exa_code;
	}
	public void setExa_code(String exa_code) {
		this.exa_code = exa_code;
	}
	public String getCurexa_code() {
		return curexa_code;
	}
	public void setCurexa_code(String curexa_code) {
		this.curexa_code = curexa_code;
	}
	public String getCur_code() {
		return cur_code;
	}
	public void setCur_code(String cur_code) {
		this.cur_code = cur_code;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	
}
