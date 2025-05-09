package com.sit.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sit.model.Student;

public class TestPrototypeUsingCoreContainer {
	
	public static void main(String[] args) {
		Resource rs=new ClassPathResource("beans.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
		Student student = bf.getBean(Student.class);
		System.out.println(student);
		Student student1 = bf.getBean(Student.class);
		System.out.println(student1);
		
		/*
		 * prototype using bean factory give different object while calling bean
		 */		
	}

}
