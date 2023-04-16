package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"ComponetScanTest"})
public class CustomConfiguration {

    @Bean("Mukesh")
    public Student getStudent1()
    {
        System.out.println("Spring calll.. in config bean of student");
        return new Student("Mukesh Kumar Pal");
    }

    @Bean("Hitarth")
    @Lazy
    public Student getStudent2()
    {
        System.out.println("Spring calll.. in config bean of student");
        return new Student("Hitarth Singh");
    }

}
