package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Sprint4day1p1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Sprint4day1p1Application.class, args);
		
		
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService=ctx.getBean("personService",PersonService.class);
		personService.printSkillMap();
		personService.printPersonList();
		
	}
@Bean
	public PersonService getObject() {
		return new PersonService();
	}
}
