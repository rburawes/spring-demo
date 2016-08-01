package com.demo;

import com.demo.model.Car;
import com.demo.model.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Declares beans.
 * Demonstrates Java based configuration of Spring.
 */
@ComponentScan("com.demo")
@Configuration
public class ApplicationConfig {

    @Bean
    public Car car(){
        Car car = new Car();
        car.setCarName("Subaru");
        return car;
    }

    @Bean
    public Engine engine(){
        Engine engine = new Engine();
        engine.setEngingName("DOHC 16-Valve");
        return engine;
    }
}
