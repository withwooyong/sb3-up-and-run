package com.example.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("greeting")
public class Greeting {
    private String name;
    private String coffee;
}
