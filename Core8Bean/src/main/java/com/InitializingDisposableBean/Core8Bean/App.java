package com.InitializingDisposableBean.Core8Bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ConfigurableApplicationContext context = 
                new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        
        	Employee cust = (Employee)context.getBean("emp");
        	
        	System.out.println(cust);
        	
        	context.close();
        //System.out.println( "Hello World!" );
    }
}
