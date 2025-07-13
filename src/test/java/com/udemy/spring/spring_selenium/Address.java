package com.udemy.spring.spring_selenium;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Autowired
    private Faker faker;

//    @Value("${street}")
//    private String street;

//    public Address(){
//        this.street = "123 Main Street";
//    }

    public String getStreet() {
        //return street;
        return faker.address().streetAddress();
    }
}
