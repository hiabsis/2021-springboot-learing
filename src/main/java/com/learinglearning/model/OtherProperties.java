package com.learinglearning.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "other")
@PropertySource("classpath:other.properties")
@Data
public class OtherProperties {
    private String title;
    private String blog;
}
