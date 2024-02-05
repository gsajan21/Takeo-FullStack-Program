package com.sajan;

import com.sajan.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee();
        employee.setFirstName("Ram");
        employee.setLastName("Gurung");
        employee.setCity("San Mateo");
        employee.setPostalCode("94015");

        session.save(employee);
        transaction.commit();


        sessionFactory.close();


        updateRecordsById(2); // update employee records using empId
//        deleteRecordsById(1); // delete employee records using empId

    }

    public static void deleteRecordsById(Integer empId) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = null;

        try {
            // Begin transaction
            transaction = session.beginTransaction();

            // Load the Employee to be Deleted
            Employee employeeToDelete = session.get(Employee.class, empId);

            session.delete(employeeToDelete);

            // Commit the transaction
            transaction.commit();
    } catch(
    Exception e)

    {
        // Handle exceptions
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    } finally{
        // Close the session
        session.close();
    }
}
    public static void updateRecordsById(Integer empId){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = null;

        try {
            // Begin transaction
            transaction = session.beginTransaction();

            // Load the Employee to be updated
            Employee employeeToUpdate = session.get(Employee.class, empId);

            // Check if the employee exists
            if (employeeToUpdate != null) {
                // Modify the Employee's state
                employeeToUpdate.setFirstName("NewFirstName");
                employeeToUpdate.setLastName("NewLastName");
//                employeeToUpdate.setCity("NewCity");
//                employeeToUpdate.setPostalCode("NewPostalCode");

                // Call session.update to synchronize with the database
                session.update(employeeToUpdate);

                // Commit the transaction
                transaction.commit();
            } else {
                System.out.println("Employee with ID " + empId + " not found.");
            }
        } catch (Exception e) {
            // Handle exceptions
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close the session
            session.close();
        }

    }
}
