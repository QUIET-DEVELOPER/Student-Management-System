package com.student_management_system.service;

import java.util.List;

import com.student_management_system.model.Student;

public interface StudentService {
    public String createStudent(Student student);

    public String updateStudent(Student student);

    public String deleteStudent(String id);

    public Student getStudent(String id);

    public List<Student> getAllStudents();
}
