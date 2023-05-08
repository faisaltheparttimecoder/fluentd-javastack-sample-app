package com.self.javastackcomplexspringwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class JavaStackComplexSpringWebfluxApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(JavaStackComplexSpringWebfluxApplication.class, args);
    }

    private WebClient webClient = WebClient.create("http://non-existing-server:1234");

    @GetMapping("/throwException")
    public Mono<String> hello() {
        return webClient.get().retrieve().bodyToMono(String.class);
    }

}
