package com.example.thymeleaf__springboot_tutorial.repository;

import com.example.thymeleaf__springboot_tutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {




}
