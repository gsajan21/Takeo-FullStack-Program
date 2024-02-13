package com.sample.Springstandalone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")

@NamedQueries({
	@NamedQuery(
			name = "Employee.getEmployeeName",
			query="SELECT e from Employee e where e.name = : name"
			),
	@NamedQuery(
			name = "Employee.employeesortingByName",
			query="SELECT e from Employee e order by name desc"
			)


})
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_address")
	private String address;
	
	
	

	public Employee() {
		
	}

	public Employee(int empId, String name, String address) {
		
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
