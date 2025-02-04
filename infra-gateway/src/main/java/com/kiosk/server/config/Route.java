package com.kiosk.server.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Route {

    @Bean
    public RouteLocator cRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(
                        r -> r.path("/user/**")
                                .uri("http://user-service-app:8090")
                )
                .route(
                        r -> r.path("/gate/**")
                                .uri("http://user-service-app:8090")
                )
                .build();

    }
}
