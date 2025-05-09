package com.sit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sit.model.Student;

public class TestPrototypeUsingIOCContainer {
	
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		Student student = ap.getBean(Student.class);
		System.out.println(student);
		Student student1 = ap.getBean(Student.class);
		System.out.println(student1);
	}

}
