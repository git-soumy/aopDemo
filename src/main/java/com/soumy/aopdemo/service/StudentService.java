package com.soumy.aopdemo.service;

import com.soumy.aopdemo.dto.StudentDto;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentDto createStudent(StudentDto student) {

        System.out.println("Student saved");
        throw new RuntimeException("Some error happened");
    }
}
