package com.sample.Springstandalone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.Springstandalone.entity.Employee;
import com.sample.Springstandalone.service.EmployeeService;

@SpringBootApplication
public class SpringstandaloneApplication implements CommandLineRunner {

	@Autowired
	EmployeeService sampleService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringstandaloneApplication.class, args);
		
		
	}


	@Override
	public void run(String... args) throws Exception {
		
//		Employee employee1=new Employee(102,"krishna","chicago");
//		Employee employee2=new Employee(103,"john","USA");
//		Employee employee3=new Employee(104,"wang","inida");
//		Employee employee4=new Employee(105,"runak","usa");
//		Employee employee5=new Employee(106,"jhansi","chicago");
//
//		List<Employee> empList=new ArrayList<>();
//		empList.add(employee1);
//		empList.add(employee2);
//		empList.add(employee3);
//		empList.add(employee4);
//		empList.add(employee5);

//		sampleService.saveEmployee(empList);
//		System.out.println(sampleService.findByName("krishna"));
		
//		System.out.println(sampleService.employeesortingByName());

//		sampleService.deleteEmployeeById(102);

		sampleService.updateEmployeeById(103, "Sajan", "Nepal");

		
	}

}
