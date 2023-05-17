package com.sourabhsurve.SBT_BatchJob_CSVToDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbtBatchJobCsvToDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbtBatchJobCsvToDbApplication.class, args);
		System.out.println("Connected...");
	}

}
