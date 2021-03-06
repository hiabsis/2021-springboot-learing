package com.learinglearning.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "neo")
@Data
public class NeoProperties {
    private String title;
    private String description;

}
