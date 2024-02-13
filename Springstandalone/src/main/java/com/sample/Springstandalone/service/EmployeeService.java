package com.sample.Springstandalone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.Springstandalone.entity.Employee;
import com.sample.Springstandalone.repository.EmployeeRespository;

@Service

public class EmployeeService {
	@Autowired
	private EmployeeRespository employeeRespository;

	@Transactional
	public void saveEmployee(List<Employee> employees) {
		employeeRespository.saveAll(employees);
		
	}
	
	
	public Employee findByName(String name) {
		Employee emp=employeeRespository.getEmployeeName(name);
		return emp;
	}
	
	public List<Employee> employeesortingByName(){
		return employeeRespository.employeesortingByName();
	}

	public void deleteEmployeeById(Integer empId){

		employeeRespository.deleteById(empId);

	}

	public void updateEmployeeById(Integer empId, String name, String address) {
		Optional<Employee> optionalEmployee = employeeRespository.findById(empId);
		if (optionalEmployee.isPresent()) {
			Employee employee = optionalEmployee.get();
			// Update the employee properties
			employee.setName(name);
			employee.setAddress(address);
			// Save the updated employee back to the database
			employeeRespository.save(employee);
			System.out.println("Employee updated successfully: " + employee);
		} else {
			System.out.println("Employee with ID " + empId + " not found");
		}
	}


}
