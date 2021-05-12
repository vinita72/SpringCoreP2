package com.AnnotationControllerService.AnnotationControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentService")
public class StudentService {
	 @Autowired
	 StudentDAO StudentDAO;
	 public Student createNewCountry() {
	 
	  return StudentDAO.createNewStudent();
	 }
}
