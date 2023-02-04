package com.project.Springbootreactive;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration(proxyBeanMethods = false)
public class StudentRouter {

  @Bean
  public RouterFunction<ServerResponse> route(StudentController studentController) {

    return RouterFunctions
        .route(GET("/hello").and(accept(MediaType.APPLICATION_JSON)), studentController::test);
  }
}
