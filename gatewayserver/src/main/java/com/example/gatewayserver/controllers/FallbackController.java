package com.example.gatewayserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
public class FallbackController {

    @GetMapping("/accountsFallback")
    public Mono<Map<String, String>> accountsFallback() {
        return Mono.just(Map.of("message", "Fallback: Accounts Service is unavailable"));
    }
}
