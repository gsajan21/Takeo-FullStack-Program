package com.sajan;

import com.sajan.entity.Employee;
import com.sajan.repository.EmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EmployeeManagementApplication.class, args);
		EmployeeRepo employeeRepoImpl = (EmployeeRepo) context.getBean(EmployeeRepo.class);

//		Employee employee1 = new Employee("Sajan", "Gurung", "000-2132541");
//		Employee employee2 = new Employee("Ram", "Gurung", "556-2560000");
//		String message = (employeeRepoImpl.save(employee1) != null) ? "Employee saved successfully" : "Failed to save employee";
//		employeeRepoImpl.save(employee2);
//		System.out.println(message);

		// Retrieve data from database
		List<Employee> listOfAllEmployee = employeeRepoImpl.findAll();
		listOfAllEmployee.forEach(e -> System.out.println(e.getEmployeeId() +
				"\t"+e.getFistName()+
				"\t"+e.getLastName()+
				"\t"+e.getPhoneNumber()));



		// Retrieve specific record from the database
		Optional<Employee> byId = employeeRepoImpl.findById(1);
        byId.ifPresent(e -> System.out.println(e.getFistName()));

	}

}
