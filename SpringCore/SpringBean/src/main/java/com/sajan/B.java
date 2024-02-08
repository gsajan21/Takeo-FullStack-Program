package com.sajan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class B {

    @PostConstruct
    public void initializationOfBean(){
        System.out.println("Bean has been initialized");

    }

    void methodB(){
        System.out.println("This is method B.");
    }

    @PreDestroy
    public void destroyStatus(){
        System.out.println("Bean has been destroyed");

    }

}
