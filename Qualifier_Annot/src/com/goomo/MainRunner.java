package com.goomo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();
	}

}
