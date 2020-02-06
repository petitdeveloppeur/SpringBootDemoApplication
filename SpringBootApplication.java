package com.example.demo;

import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Target(ElementType.TYPE)
@Retention (RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan (excludeFilters = @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class))
@Configuration

public @interface SpringBootApplication {

	
}