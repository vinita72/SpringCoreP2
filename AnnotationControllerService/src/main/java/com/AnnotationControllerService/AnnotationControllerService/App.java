package com.AnnotationControllerService.AnnotationControllerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
 
    	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	  StudentController controller = (StudentController) context.getBean("obj");
    	  Student obj = controller.createNewStudent();
    	  System.out.println("ID : " + obj.getStudentId());
    	  System.out.println("Name : " + obj.getStudentName());
        //System.out.println( "Hello World!" );
    	  
    }
}
