package com.example.springdependencyinjection;

import com.example.springdependencyinjection.controllers.ConstructorInjectedController;
import com.example.springdependencyinjection.controllers.GreetingController;
import com.example.springdependencyinjection.controllers.PropertyInjectedController;
import com.example.springdependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController"); // bean names should starts with lowercase
		System.out.println(greetingController.getGreeting());

		System.out.println("Property based injection: -----------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("Greetings from propertyInjectedController: " + propertyInjectedController.getGreeting());

		System.out.println("Setter based injection: -----------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("Greetings from setterInjectedController: " + setterInjectedController.getGreeting());

		System.out.println("Constructor based injection: -----------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("Greetings from constructorInjectedController: " + constructorInjectedController.getGreeting());
	}

}
