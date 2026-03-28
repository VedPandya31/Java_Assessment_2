package com.model;

public class PatientModel 
{
	private int id;
    private String name,mobile;
    
    public PatientModel(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
    
}
