package com.sajan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="EmployeeDetails")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private Integer employeeId;
    @Column(name="first_name")
    private String fistName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="phone_number")
    private String phoneNumber;

    public Employee(String fistName, String lastName, String phoneNumber) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}
