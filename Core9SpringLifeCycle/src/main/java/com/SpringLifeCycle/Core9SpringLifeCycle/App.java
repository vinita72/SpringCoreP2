package com.SpringLifeCycle.Core9SpringLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )  throws Exception

    {
    	
    	// Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of
        // the bean as it loads into container
  
        ConfigurableApplicationContext lyf = new ClassPathXmlApplicationContext("Bean.xml");
  
        // It will close the spring container
        // and as a result invokes the
        // destroy() method
        lyf.close();
        //System.out.println( "Hello World!" );
    }
}
