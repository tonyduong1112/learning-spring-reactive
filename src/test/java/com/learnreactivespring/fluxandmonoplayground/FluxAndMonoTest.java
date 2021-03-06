package com.learnreactivespring.fluxandmonoplayground;

import org.junit.Test;
import reactor.core.publisher.Flux;


public class FluxAndMonoTest {
    @Test
    public void FLuxTest() {
        Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//                .concatWith(Flux.error(new RuntimeException("Exception occured")))
                .log();
        stringFlux.subscribe(System.out::println, e -> System.err.println("Exception is " + e),
                () -> System.out.println("Completed"));
    }

    @Test
    public void fluxTestElements_WithoutError() {
        Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
                .log();
    }
}
