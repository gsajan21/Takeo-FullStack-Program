package com.sample.Springstandalone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.Springstandalone.entity.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
	
	Employee getEmployeeName(@Param("name") String name);
	
	List<Employee> employeesortingByName();

}
