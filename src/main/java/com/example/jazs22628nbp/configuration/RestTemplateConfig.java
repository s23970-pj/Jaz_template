package com.example.jazs22628nbp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class RestTemplateConfig {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
