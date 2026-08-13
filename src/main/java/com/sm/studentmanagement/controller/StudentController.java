package com.sm.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.studentmanagement.dto.StudentResponseDTO;
import com.sm.studentmanagement.model.Student;
import com.sm.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/studentapi")
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/test")
	public String test() {
		return "Successful";
	}
	
	@GetMapping("/getallstudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@PostMapping("/addstudent")
	public StudentResponseDTO<Student> addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	@GetMapping("/getstudent/{frn}")
	public Student getStudent(@PathVariable String frn) {
		return studentService.getStudent(frn);
	}
	
	@PutMapping("/updatestudent")
	public StudentResponseDTO<Student> updateStudent(@RequestBody Student student) {
	
		if(studentService.updateStudent(student)!=null) {
			return new StudentResponseDTO<Student>(200,"Updated Successfully!",null);
		}else {
			return new StudentResponseDTO<Student>(500,"some error occured!",null);
		}
	}
	
	@DeleteMapping("/deletestudent/{frn}")
	public StudentResponseDTO<Student> deleteStudent(@PathVariable String frn){
		return studentService.deleteStudent(frn);
	}
	
}
