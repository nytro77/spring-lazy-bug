package com.example.lazysetterdiproblem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("thething")
public class TheThingConfig {

	@Bean
	public TheThing theThing() {
		return new TheThing() {
		};
	}
	
}
