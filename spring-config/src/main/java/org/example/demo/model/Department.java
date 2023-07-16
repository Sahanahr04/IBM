package org.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class Department {

	private int departmentId;
	private String departmentName;
	private Location location;
	
	
	//@Autowired
	public Department(Location location) {
		
		this.location = location;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "departmentId :" + departmentId + " departmentName:" + departmentName + "location:"
				+ location;
	}
	
	
	
	
}
