package com.microservice.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;
import java.util.List;

@ConfigurationProperties(prefix = "contacts")
public record ContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
