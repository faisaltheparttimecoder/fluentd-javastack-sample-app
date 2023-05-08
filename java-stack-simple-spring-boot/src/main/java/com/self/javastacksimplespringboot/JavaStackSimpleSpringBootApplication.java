package com.self.javastacksimplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class JavaStackSimpleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStackSimpleSpringBootApplication.class, args);
	}

    @GetMapping("/throwException")
    public void throwException() {
        while (true) {
            try {
                Thread.sleep(3000); // sleep for 5 seconds
                throw new RuntimeException("Forcefully throwing up Internal Spring Boot simple java stack exception!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

