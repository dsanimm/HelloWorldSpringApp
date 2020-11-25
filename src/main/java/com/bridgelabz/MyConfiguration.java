package com.bridgelabz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.bridgelabz")
@Configuration
public class MyConfiguration {
    @Bean(name = "sujit")
    public Student getStudent(){
        Student student = new Student();
        student.setName("Sujit");
        return student;
    }
    @Bean(name = "abc")
    public Student getAbc(){
        Student student = new Student();
        student.setName("ABC");
        return student;
    }

}
