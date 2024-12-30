package com.microservice.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;
import java.util.List;

@ConfigurationProperties(prefix = "contacts")
public class ContactInfoDto {
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Map<String, String> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<String> getOnCallSupport() {
        return onCallSupport;
    }

    public void setOnCallSupport(List<String> onCallSupport) {
        this.onCallSupport = onCallSupport;
    }
}

