package com.sajan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    public B b(){
        return new B();
    }

    @Bean("a")
    @Scope(value="prototype")
    public A a(){
        return new A();
    }
    @Bean
    public C c(){
        return new C();
    }
}
