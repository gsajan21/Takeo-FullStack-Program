package org.oop;

public class Sample {



    void test1() {

        float z =	test(10,23.5f);

        System.out.println(z);
    }

    float test( int a,float b) {



        return a+b;
    }

    public static void main(String[] args) {

        Sample s = new Sample();
        s.test1();

    }

}
