package com.example.thymeleaf__springboot_tutorial;

import com.example.thymeleaf__springboot_tutorial.entity.Student;
import com.example.thymeleaf__springboot_tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafSpringBootTutorialApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafSpringBootTutorialApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("John", "Doe", "john.doe@gmail.com");
        studentRepository.save(student1);
        Student student2 = new Student("Jane", "Doe", "jane@gmail.com");
        studentRepository.save(student2);
        Student student3 = new Student("John", "Smith", "johnsmith@gmail.com");
        studentRepository.save(student3);
    }
}
