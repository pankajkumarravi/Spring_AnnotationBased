package com.goomo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorld.class);
		HelloWorld hw=context.getBean(HelloWorld.class);
		hw.setMessage("Hi all !!!!");
		hw.getMessage();

	}

}
