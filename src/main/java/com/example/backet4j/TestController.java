package com.example.backet4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("test")
@RestController
public class TestController {

    @GetMapping("testing")
    public String test(){
        return "test";
    }
    @GetMapping("testing-flex")
    public Mono<String> testFlex(){
        return Mono.just("testFlex");
    }
}
