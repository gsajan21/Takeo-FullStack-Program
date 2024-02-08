package com.sajan.config;


import com.sajan.dao.EmployeeDao;
import com.sajan.service.EmployeeServiceImpl;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class Config {
    @Bean
    public EmployeeDao employeeDao(){
        return new EmployeeDao();
    }

    @Bean
    public EmployeeServiceImpl employeeService(){
        return new EmployeeServiceImpl();
    }

    @Bean
    DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/takeodb");
        dataSource.setUsername("sajan");
        dataSource.setPassword("enter@123");
        return dataSource;

    }

    public LocalSessionFactoryBean sessionFactoryBean(){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setHibernateProperties(properties());

        return sessionFactoryBean;
    }

    public PlatformTransactionManager transactionManager(){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactoryBean().getObject());

        return transactionManager;

    }
    private Properties properties(){
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2dl", "create-update");
        return properties;
    }
}
