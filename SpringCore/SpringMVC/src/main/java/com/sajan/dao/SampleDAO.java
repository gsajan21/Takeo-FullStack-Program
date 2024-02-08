package com.sajan.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDAO {

    @Autowired
    SessionFactory sessionFactory;
    public void saveEmployee(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


    }
}
