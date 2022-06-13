package com.example.thymeleaf__springboot_tutorial.service;

import com.example.thymeleaf__springboot_tutorial.entity.Student;

import java.util.List;

public interface StudentService {

    //list all students
    List<Student> getAllStudents();

    //get student by id
    Student getStudentById(Long id);

    Student saveStudent(Student student);

    Student updateStudent(Student student);
}
