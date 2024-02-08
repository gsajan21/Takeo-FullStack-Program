package com.sajan;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class A {
    private Integer x;
    @Autowired
    private B b;
    @Autowired
    private C c;

    public A() {
    }

    public A(Integer x, B b) {
        this.x = x;
        this.b = b;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }


    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    void method(){
        System.out.println("This is class A.");
        b.methodB();
        c.method();

    }
}
