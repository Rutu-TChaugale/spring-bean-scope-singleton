package com.sit.client;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sit.model.Student;

public class TestSingletonUsingCoreContainer {
	
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("beans.xml");
					BeanFactory bf=new XmlBeanFactory(resource);
					Student student = bf.getBean(Student.class);
					System.out.println(student);
					Student student1 = bf.getBean(Student.class);
					System.out.println(student1);
					
					//deskto based scope in that single ton is used to create a object at once
	}

}

