package com.citydetails.r005453;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.citydetails.r005453")
public class CityApp {

	public static void main(String[] args) {
		SpringApplication.run(CityApp.class, args);
	}

}