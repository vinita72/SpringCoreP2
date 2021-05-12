package com.AnnotationControllerService.AnnotationControllerService;
import org.springframework.stereotype.Repository;

@Repository("StudentDAO")
public class StudentDAO {

	public Student createNewStudent() {
		  // You should get it from database
		Student student = new Student("Vachi", 014);
		  return student;
		 }
}
