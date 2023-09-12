package com.example.rasmiMysqlHospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })

public class RasmiMysqlHospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RasmiMysqlHospitalApplication.class, args);
	}

}
