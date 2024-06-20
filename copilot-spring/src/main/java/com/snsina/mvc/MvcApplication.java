package com.snsina.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MvcApplication.class, args);
	}

	// write a java method named holidays_excluded to calculate the number of days between two dates excluding holidays
	// @param: start_date
	// @param: end_date
	// @return: number of days between two dates excluding holidays
	public static int holidays_excluded(String start_date, String end_date) {
		// calculate days between end_date and start_date
		// return the number of days


	}

}
