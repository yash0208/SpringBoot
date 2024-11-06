package com.rajaryan.config;

import com.rajaryan.Alien;
import com.rajaryan.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(){
        return new Alien();
    }

    @Bean(name = {"desktop1","beast"})
    @Scope(value = "prototype")
    public Desktop desktop(){
        return  new Desktop();
    }
}
