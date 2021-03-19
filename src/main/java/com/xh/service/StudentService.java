package com.xh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xh.entiy.Student;
import com.xh.repository.StudentRepository;

@Component
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void saveStudent(Student student){
		studentRepository.save(student);
	}
}
