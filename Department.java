package com.example.demo.entity;

 import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long departmentid;
	private String departmentName;
	private String departmentCode;
	private String departmentAddress;
	public Department() {
		super();
	}
	public Department(long departmentid, String departmentName, String departmentCode, String departmentAddress) {
		super();
		this.departmentid = departmentid;
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
		this.departmentAddress = departmentAddress;
	}
	public long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentName=" + departmentName + ", departmentCode="
				+ departmentCode + ", departmentAddress=" + departmentAddress + "]";
	}
	}