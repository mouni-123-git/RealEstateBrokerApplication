package com.cg.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Broker extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int broId;
	private String broName;
	private List<Property> properties;
	public Broker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Broker(String userid, String password, String role, String mobile, String email, String city) {
		super(userid, password, role, mobile, email, city);
		// TODO Auto-generated constructor stub
	}
	public Broker(int broId, String broName, List<Property> properties) {
		super();
		this.broId = broId;
		this.broName = broName;
		this.properties = properties;
	}
	public int getBroId() {
		return broId;
	}
	public void setBroId(int broId) {
		this.broId = broId;
	}
	public String getBroName() {
		return broName;
	}
	public void setBroName(String broName) {
		this.broName = broName;
	}
	public List<Property> getProperties() {
		return properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Broker [broId=" + broId + ", broName=" + broName + ", properties=" + properties + "]";
	}
	
	
}
