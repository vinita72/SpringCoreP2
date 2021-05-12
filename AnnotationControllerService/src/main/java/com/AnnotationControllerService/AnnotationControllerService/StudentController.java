package com.AnnotationControllerService.AnnotationControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentController")
public class StudentController {

	@Autowired
    Student studentService;
 
    public Student createNewStudent()
    {
        return studentService.createNewStudent();
    }
}
