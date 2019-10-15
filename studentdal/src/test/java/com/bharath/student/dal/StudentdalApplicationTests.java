package com.bharath.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.student.dal.entities.Student;
import com.bharath.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {

		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFee(30d);

		studentRepository.save(student);

	}
	
	@Test
	public void testFindStudentById() {
		Student student = studentRepository.findOne(1l);
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Student student = studentRepository.findOne(1l);
		student.setFee(40d);
		
		studentRepository.save(student);
	}
	
	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(1l);
		studentRepository.delete(student);
	}

}









