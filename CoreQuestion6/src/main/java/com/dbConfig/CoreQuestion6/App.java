package com.dbConfig.CoreQuestion6;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


	public class App 
		{
		public static void main( String[] args ) throws SQLException
		{
    	
	    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.dbConfig.CoreQuestion6");
			context.refresh();
			System.out.println("Refreshing the spring context");
			ConnectionsClass Connection = context.getBean(ConnectionsClass.class);
	
			ConnectionsClass.printDBConfigs();
			
			// close the spring context
			context.close();
	}
       // System.out.println( "Hello World!" );
}
