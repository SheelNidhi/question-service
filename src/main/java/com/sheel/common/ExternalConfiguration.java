package com.sheel.common;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExternalConfiguration {

    @Bean
    public MyBean byBean() {
        if (true) {
            return new MyBean("default");
        } else {
            return new MyBean("Custom");
        }
    }

}
