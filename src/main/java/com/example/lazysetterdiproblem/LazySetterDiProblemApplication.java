package com.example.lazysetterdiproblem;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class LazySetterDiProblemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazySetterDiProblemApplication.class, args);
	}
}

@Component
class TheClass implements InitializingBean {
	
	private TheThing theThing;
	
	@Autowired(required = false)
	@Lazy
	public void setTheThing(TheThing theThing) {
		this.theThing = theThing;
	}
	
	public void doTheThingIfPossible() {
		
		if( theThing != null) {
			theThing.doTheThing();
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		doTheThingIfPossible();		
	}
	
	
}
