package com.amazon.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EMP {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("empConfig.xml");
		Employee emp = (Employee) applicationContext.getBean("employeeBean");
		System.out.println("Employee details: Id="+emp.getId() +", Name="+emp.getName());
	}

}
