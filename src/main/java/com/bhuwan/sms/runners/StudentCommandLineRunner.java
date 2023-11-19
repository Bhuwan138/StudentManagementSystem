package com.bhuwan.sms.runners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhuwan.sms.entities.Student;
import com.bhuwan.sms.repository.StudentRepository;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
//		List<Student> studentList = new ArrayList<>(Arrays.asList(
//				new Student("Bhuwan","Pandey","pandeybhuwan138@gmail.com","9863890810"),
//				new Student("Ajay","Mouriya","ajaymouriya24@gmail.com","9865324512"),
//				new Student("Gokarna","Joshi","joshigokarna224@gmail.com","9845758562")				
//				));
//		 repo.saveAll(studentList);

	}

}
