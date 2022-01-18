package com.mbcrud.mbcruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MbcruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbcruddemoApplication.class, args);
	}

}
