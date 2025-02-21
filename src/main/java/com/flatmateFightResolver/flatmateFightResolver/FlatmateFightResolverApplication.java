package com.flatmateFightResolver.flatmateFightResolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FlatmateFightResolverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlatmateFightResolverApplication.class, args);
	}

}
