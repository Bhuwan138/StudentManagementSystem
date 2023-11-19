package com.bhuwan.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhuwan.sms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
