package com.student_management_system.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student_management_system.model.Student;
import com.student_management_system.repository.StudentRepo;
import com.student_management_system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    StudentRepo repo;

    public StudentServiceImpl(StudentRepo repo) {
        this.repo = repo;
    }

    @Override
    public String createStudent(Student student) {
        repo.save(student);
        return "Student Created Sucessfully";
    }

    @Override
    public String updateStudent(Student student) {
        repo.save(student);
        return "Student Updated Sucessfully";
    }

    @Override
    public String deleteStudent(String id) {
        repo.deleteById(id);
        return "Student Deleted Sucessfully";
    }

    @Override
    public Student getStudent(String id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
    
}
