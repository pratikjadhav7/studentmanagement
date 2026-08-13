package com.sm.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.studentmanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student,String> {

	

}
