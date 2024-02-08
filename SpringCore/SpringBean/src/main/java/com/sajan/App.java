package com.sajan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Object object = applicationContext.getBean("a");

        A a = (A) object;
        System.out.println(a);
        a.method();




//        a.method();
//        System.out.println(a.getB());
    }
}
