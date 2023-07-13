package org.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
	public class Employee {
		private int employeeId;

		
		private String emloyeeName;
		
		private double salary;
		@Autowired //attribute level
		private Department department;
		//@Autowired  constructor level 
		
		public Employee(Department department) {
			
			this.department = department;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmloyeeName() {
			return emloyeeName;
		}

		public void setEmloyeeName(String emloyeeName) {
			this.emloyeeName = emloyeeName;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		@Override
		public String toString() {
			return "employeeId=" + employeeId + " emloyeeName=" + emloyeeName + "salary=" + salary
					+ " department=" + department;
		}
		
		
		
		
}
