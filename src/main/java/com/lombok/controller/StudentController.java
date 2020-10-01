package com.lombok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lombok.dao.StudentDao;
import com.lombok.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired StudentDao student;
	
	@GetMapping("/")
	public List<Student> getStudentData() {
		List<Student> studentList = student.findAll();
		for (Student s : studentList) {
			System.out.println(s.getFirstName());
		}
		return studentList;
	}
}
