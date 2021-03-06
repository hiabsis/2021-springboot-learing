package com.learinglearning.config;

import com.learinglearning.filter.MyFilter;
import com.learinglearning.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import java.util.logging.Filter;

@Configuration
public class WebConfiguration {
    @Bean
    public FilterRegistrationBean testFilterRegistration(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.setName("MyFilter");
        registration.setOrder(6);
        return  registration;
    }

    @Bean
    public  FilterRegistrationBean testFilterRegistration2(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter2());
        registration.setName("MyFilter 2");
        registration.setOrder(1);
        return  registration;

    }
}
