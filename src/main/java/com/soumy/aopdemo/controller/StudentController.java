package com.soumy.aopdemo.controller;

import com.soumy.aopdemo.dto.StudentDto;
import com.soumy.aopdemo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto student) {
        StudentDto s = studentService.createStudent(student);
        return ResponseEntity.ok(s);
    }

    @GetMapping("/get")
    public ResponseEntity<String> dummyMethod() {
        String s ="hello";

        return ResponseEntity.ok(studentService.dummyMethod(s));
    }
}
