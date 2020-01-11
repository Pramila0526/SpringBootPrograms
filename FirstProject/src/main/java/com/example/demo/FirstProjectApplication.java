package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context=  SpringApplication.run(FirstProjectApplication.class, args);
	
		/**
		 * CustomerData customer=new CustomerData(); 
		 * So normally we create an object by using new keyword
		 * But the Dependency Injection Says You dont have to focus on Object Creation
		 * You have to focus on the Logic we will give you a object when you require it
		 */
		
		//use run method of line no12.
		//run method returns an object of ConfigurationContext
	}

}
