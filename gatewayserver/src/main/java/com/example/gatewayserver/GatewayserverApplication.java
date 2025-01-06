package com.example.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class GatewayserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayserverApplication.class, args);
    }

    @Bean
    public RouteLocator BankRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("accounts-route", path -> path
                        .path("/bank/accounts/**")
                        .filters(filter -> filter.rewritePath("/bank/accounts/(?<segment>.*)", "/${segment}")
                                .addResponseHeader("X-Repsonse-Time", LocalDateTime.now().toString()))
                        .uri("lb://ACCOUNTS"))
                .route("loans-route", path -> path
                        .path("/bank/loans/**")
                        .filters(filter -> filter.rewritePath("/bank/loans/(?<segment>.*)", "/${segment}")
                                .addResponseHeader("X-Repsonse-Time", LocalDateTime.now().toString()))
                        .uri("lb://LOANS"))
                .route("cards-route", path -> path
                        .path("/bank/cards/**")
                        .filters(filter -> filter.rewritePath("/bank/cards/(?<segment>.*)", "/${segment}")
                                .addResponseHeader("X-Repsonse-Time", LocalDateTime.now().toString()))
                        .uri("lb://CARDS"))
                .build();
    }
}
