package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//Ioc container starts (ctlr+space)
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		
		//getBean called
		
		Student res=con.getBean("s1",Student.class);
		System.out.println(res);

	}

}
