package com.sajan.SpringStandalone.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
    private Integer empId;
    @Column(name="emp_name")
    private String name;
    @Column(name="emp_salary")
    private Integer salary;

    public Employee() {
    }

    public Employee(Integer empId, String name, Integer salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
