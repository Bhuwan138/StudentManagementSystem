package com.bhuwan.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhuwan.sms.entities.Student;
import com.bhuwan.sms.repository.StudentRepository;

@Service
public class StudentServiceMgmtImpl implements IStudentServiceMgmt {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		repo.deleteById(id);
	}
	
	


}
