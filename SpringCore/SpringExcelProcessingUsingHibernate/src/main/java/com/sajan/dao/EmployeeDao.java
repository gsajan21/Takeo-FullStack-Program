package com.sajan.dao;

import com.sajan.model.Employee;
import com.sajan.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;


public class EmployeeDao {
    @Autowired
    SessionFactory sessionFactory;
    public void saveEmployees(Employee employee) throws SQLException {
           Session session = sessionFactory.openSession();
           Transaction transaction = session.getTransaction();
           session.save(employee);
           transaction.commit();
           session.close();

    }
    public Employee getEmployeeById(Integer empId){

        Session session = getSession();

        return session.get(Employee.class, empId);

    }

    public List<Employee> getAllEmployees(){
//        List<Employee> listOfEmployees = new ArrayList<>();

        Query<Employee> query = null;
        try {
            Session session = getSession();
            String hql = "From Employee";
            query = session.createQuery(hql, Employee.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return query.list() ;
    }

    public void updateNameById(String newName, Integer empId){

        Session session = getSession();
        Transaction transaction = beginTransaction(session);
        Employee employee = session.get(Employee.class, empId);
        if(employee!= null){
            employee.setEmpName(newName);
            transaction.commit();
            System.out.println("Employee name updated successfully.");
        }
        closeSessionFactory();

    }
    public void updateAddressById(String newAddress, Integer empId){
        Session session = getSession();
        Transaction transaction = beginTransaction(session);
        Employee employee = session.get(Employee.class, empId);
        if(employee!= null){
            employee.setAddress(newAddress);
            transaction.commit();
            System.out.println("Employee address updated successfully.");
        }
        closeSessionFactory();

    }
    public void updateSalaryById(Integer newSalary, Integer empId){
        Session session = getSession();
        Transaction transaction = beginTransaction(session);
        Employee employee = session.get(Employee.class, empId);
        if(employee!= null){
            employee.setSalary(newSalary);
            transaction.commit();
            System.out.println("Employee salary updated successfully.");
        }

        closeSessionFactory();

    }


}
