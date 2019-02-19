package com.citydetails.r005453;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CityApp {

	public static void main(String[] args) {
		SpringApplication.run(CityApp.class, args);
	}

	/*public class ServletInitializer extends SpringBootServletInitializer {

		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(SpringBootApplication.class);
		}

	}*/
}