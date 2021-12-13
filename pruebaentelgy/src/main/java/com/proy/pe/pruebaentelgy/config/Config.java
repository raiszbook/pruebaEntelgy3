package com.proy.pe.pruebaentelgy.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.proy.pe.pruebaentelgy.properties.ApplicationProperties;

@Configuration
@EnableConfigurationProperties({
        ApplicationProperties.class
})
public class Config {

    @Bean(name = "externalRestTemplate")
    public RestTemplate createExternalRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }
}
