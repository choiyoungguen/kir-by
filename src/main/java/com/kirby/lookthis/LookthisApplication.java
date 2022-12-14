package com.kirby.lookthis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.kirby.lookthis.*.repository")
@EntityScan("com.kirby.lookthis.*.entity")
public class LookthisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LookthisApplication.class, args);
	}

}
