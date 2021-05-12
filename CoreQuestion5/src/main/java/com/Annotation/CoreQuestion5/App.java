package com.Annotation.CoreQuestion5;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Annotation.CoreQuestion5.model.Student;
import com.Annotation.CoreQuestion5.repository.StudentRepository;


public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.Annotation.CoreQuestion5");
		context.refresh();

		StudentRepository repository = context.getBean(StudentRepository.class);

		// store
		repository.store(new Student(1, "Vachi", "Electrical"));
		repository.store(new Student(2, "Anupam", "CS"));
		repository.store(new Student(3, "Meghna", "ECS"));

		// retrieve
		Student stu = repository.retrieve(1);
		System.out.println(stu);

		// search
		Student top = repository.search("Meghna");
		System.out.println(top);

		// delete
		Student Delete = repository.delete(2);
		System.out.println(Delete);

		// close the spring context
		context.close();
	}
        // System.out.println( "Hello World!" );
    }

