package com.project.Springbootreactive;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.project.Springbootreactive.Student;

import reactor.core.publisher.Mono;
@Component
public class StudentController {

  public Mono<ServerResponse> test(ServerRequest serverRequest)
  {
    return serverRequest.bodyToMono(Student.class).flatMap(student -> ServerResponse.ok().body(fromObject(student)));

  }

}
