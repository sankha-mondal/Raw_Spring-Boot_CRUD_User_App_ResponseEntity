package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SrsAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
			SpringApplication.run(SrsAppApplication.class, args);

		String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);

		// All default beans
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
		System.out.println("Spring-Boot Raw User Application running on port No: 8585...");
	}

}
