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
		
		/*
		 * prototype using application context give different object while calling bean
		 */
		
		
		
		/*
		 * lazy and eager loading
		 * 
		 * scenario 1(when scope =singleton) 1) Beanfactory work as lazy loading
		 * 2)Application context work as eager loading
		 * 
		 * scenario 2(when scope =prototype) 1) Beanfactory work as lazy loading
		 * 2)Application context work as lazy loading
		 */
	}

}
