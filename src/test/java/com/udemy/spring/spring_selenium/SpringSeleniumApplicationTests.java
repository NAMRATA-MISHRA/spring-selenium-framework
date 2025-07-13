package com.udemy.spring.spring_selenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumApplicationTests {


	@Autowired
	private User user;

//	@Value("${PATH}")
//	private String path;

	@Value("${TEST_URL:http://www.google.com}")
	private String path;

//	@Value(("${fruits}"))
//	private String fruits;

//	@Value(("${fruits}"))
//	private List<String> fruits;
//
//	@Value("${timeout}")
//	private int timeout;
//
//	@Value("${myusername}")
//	private String username;
//
//	@Autowired
//	private Faker faker;

	@Autowired
	private Television tv;

	@Test
	void contextLoads() {
//		User user = new User();
//		user.setAddress(new Address());
		//user.printDetails();
//		System.out.println(this.path);
//		System.out.println(this.fruits);
//		System.out.println(this.fruits.size());
//		System.out.println(this.username);
		//this.user.printDetails();

		//Faker faker = new Faker();
//		System.out.println(faker.name().fullName());
//		this.user.printDetails();
		this.tv.playMovie();
	}

// user, salary and address
//	Address address = new Address();
//	Salary salary = new Salary();
//
//	User user = new User(address, salary);
//		user.printDetails();


}
