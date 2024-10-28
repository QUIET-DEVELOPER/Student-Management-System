package com.student_management_system.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student_management_system.model.Student;
import com.student_management_system.service.StudentService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/student")
public class StudentAPI {

    StudentService service;

    public StudentAPI(StudentService service) {
        this.service = service;
    }

    @GetMapping("{id}")    
    public Student getStudent(@PathVariable("id") String id) {
        return service.getStudent(id);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public String createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @PutMapping
    public String UpdateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("{id}")
    public String deleteString(@PathVariable("id") String id) {
        return service.deleteStudent(id);
    }
}
