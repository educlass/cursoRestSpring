package com.algaworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;


//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//@ComponentScan(basePackageClasses=CursoResource.class)
@SpringBootApplication
public class Main extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
