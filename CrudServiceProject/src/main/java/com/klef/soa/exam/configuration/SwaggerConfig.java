package com.klef.soa.exam.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig 
{
    @Bean
    public OpenAPI customOpenAPI() 
    {
        return new OpenAPI()
                .info(new Info()
                        .title("Organic Farm Project API")
                        .version("1.0")
                        .description("CRUD Service Project")
                        .contact(new Contact()
                                .name("KL University")
                                .email("2400030741@gmail.com")));
    }
}
