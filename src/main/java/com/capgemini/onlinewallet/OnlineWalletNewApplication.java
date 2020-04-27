package com.capgemini.onlinewallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class OnlineWalletNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineWalletNewApplication.class, args);
		System.out.println("SpringBoot Application Started");
	}

}
