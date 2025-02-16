package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		
		
		
		Student res=con.getBean("s1",Student.class);
		

	}

}
