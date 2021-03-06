package com.cybage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Employee e = (Employee) context.getBean("emp");
		System.out.println(e);

		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(Config.class);
		 * 
		 * Employee e = (Employee) context.getBean("emp"); System.out.println(e);
		 * 
		 * Employee e1 = (Employee) context.getBean("emp1"); System.out.println(e1);
		 */
	}
}
