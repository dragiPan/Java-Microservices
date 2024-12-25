package com.microservice.cards;

import com.microservice.cards.dto.BuildInfoDto;
import com.microservice.cards.dto.ContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = { ContactInfoDto.class, BuildInfoDto.class })
@OpenAPIDefinition(
		info = @Info(
				title = "Cards Microservice REST API Documentation",
				description = "Cards Microservice REST API for managing customer card details",
				version = "v1",
				contact = @Contact(
						name = "Dragi Pantović",
						email = "contact@cards-ms.com",
						url = "https://cards-ms.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://cards-ms.com/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Cards Microservice API Documentation",
				url = "https://cards-ms.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
