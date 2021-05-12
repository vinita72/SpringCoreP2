package com.InjectionCollectionMap.InjectionCollectionMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Question obj = (Question)applicationContext.getBean("obj");
        obj.display();   
    }
}
