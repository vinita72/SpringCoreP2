package com.Annotation.CoreQuestion5.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.Annotation.CoreQuestion5.model.Student;

@Repository 
public class StudentRepository implements 
ObjectRepository <Student>{
	private Map<Integer, Student> repository;
 
	public StudentRepository() {
		this.repository = new HashMap<>();
	}
	@Override
	public void store(Student stu) {
		repository.put(stu.getStudentId(), stu);
	}
	@Override
	public Student retrieve(int studentId) {
		return repository.get(studentId);
	}
	@Override
	public Student search(String stdentName) {
		Collection<Student> stus = repository.values();
		for (Student stu : stus) {
			if (stu.getStudentName().equalsIgnoreCase(stdentName))
				return stu;
		}
		return null;
	}
	@Override
	public Student delete(int studentId) {
		Student S = repository.get(studentId);
		this.repository.remove(studentId);
		return S;
	}
}
