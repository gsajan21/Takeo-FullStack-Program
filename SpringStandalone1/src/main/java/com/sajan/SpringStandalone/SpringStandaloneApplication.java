package com.sajan.SpringStandalone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStandaloneApplication implements CommandLineRunner {
	@Autowired
	SampleService sampleService;

	public static void main(String[] args) {
		SpringApplication.run(SpringStandaloneApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		sampleService.method("Hello, how are you");
	}
}
