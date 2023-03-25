package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackageClasses = DonorRepository.class)
@SpringBootApplication(scanBasePackages = {"com.example.demo","com.example.demo.donorPackage"})
public class BloodDonorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodDonorApplication.class, args);
	}

}
