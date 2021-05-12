package com.ApplicationContextAware.Core10ApplicationContextAware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
    	 
        ApplicationContextImpl applicationContextAwareImpl = (ApplicationContextImpl) applicationContext.getBean("app");
       
        System.out.println("Application context aware output");
        applicationContextAwareImpl.displayPersonDetails();
       
 
       // System.out.println( "Hello World!" );
    }
}
