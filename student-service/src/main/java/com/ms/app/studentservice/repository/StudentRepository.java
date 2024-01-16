package com.ms.app.studentservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.app.studentservice.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
	
}