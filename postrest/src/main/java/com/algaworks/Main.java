package com.algaworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;


@SpringBootApplication
//@ComponentScan(basePackageClasses=CursoResource.class)
public class Main extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
