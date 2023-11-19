package com.bhuwan.sms.service;

import java.util.List;

import com.bhuwan.sms.entities.Student;

public interface IStudentServiceMgmt {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
}
