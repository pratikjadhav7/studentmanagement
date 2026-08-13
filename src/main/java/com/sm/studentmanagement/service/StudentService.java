package com.sm.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.studentmanagement.dto.StudentResponseDTO;
import com.sm.studentmanagement.model.Student;
import com.sm.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;

	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	public StudentResponseDTO<Student> addStudent(Student student) {

		if (studentRepo.existsById(student.getFrn())) {
			return new StudentResponseDTO<Student>(500, "Already exists!", null);
		} else {
			Student res = studentRepo.save(student);
			if (res != null) {
				return new StudentResponseDTO<Student>(200, "Student Added Successfully!", student);
			} else {
				return new StudentResponseDTO<Student>(500, "Some error occureed!", null);
			}
		}
	}

	public Student getStudent(String frn) {
		Optional<Student> res = studentRepo.findById(frn);

		if (res.isPresent()) {
			return res.get();
		}

		return null;
	}

	public Student updateStudent(Student student) {
		return studentRepo.save(student);

	}

	public StudentResponseDTO<Student> deleteStudent(String frn) {

		if (studentRepo.existsById(frn)) {

			studentRepo.deleteById(frn);

			return new StudentResponseDTO<Student>(200, "Student Deleted Successfully!", null);

		} else {

			return new StudentResponseDTO<Student>(404, "Student Not Found!", null);
		}
	}
}
