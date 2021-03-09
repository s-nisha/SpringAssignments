package com.emp;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:employee.properties")
@ComponentScan("com.emp")

public class Config {

}
