package com.student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student_management_system.model.Student;

public interface StudentRepo extends JpaRepository<Student, String>{
    
}
