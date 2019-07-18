package com.bcu.bean;

public class Pro {
	private String pro_id;
	private String pro_name;
	private String pro_type;
	private String pro_per;
	private String pro_dan;
	private String pro_num;
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	private int flag;
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_type() {
		return pro_type;
	}
	public void setPro_type(String pro_type) {
		this.pro_type = pro_type;
	}
	public String getPro_per() {
		return pro_per;
	}
	public void setPro_per(String pro_per) {
		this.pro_per = pro_per;
	}
	public String getPro_dan() {
		return pro_dan;
	}
	public void setPro_dan(String pro_dan) {
		this.pro_dan = pro_dan;
	}
	public String getPro_num() {
		return pro_num;
	}
	public void setPro_num(String pro_num) {
		this.pro_num = pro_num;
	}
	public Pro(String pro_id, String pro_name, String pro_type, String pro_per, String pro_dan, String pro_num) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.pro_type = pro_type;
		this.pro_per = pro_per;
		this.pro_dan = pro_dan;
		this.pro_num = pro_num;
	}
	public Pro() {
		super();
		// TODO Auto-generated constructor stub
	}
}
