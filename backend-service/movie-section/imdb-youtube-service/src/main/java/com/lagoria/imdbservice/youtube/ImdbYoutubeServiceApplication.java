package com.lagoria.imdbservice.youtube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ImdbYoutubeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdbYoutubeServiceApplication.class, args);
	}

	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
