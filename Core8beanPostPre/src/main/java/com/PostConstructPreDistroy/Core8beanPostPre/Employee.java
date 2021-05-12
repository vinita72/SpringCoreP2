package com.PostConstructPreDistroy.Core8beanPostPre;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
String message;
    
		@PostConstruct
		public void init() {
		  System.out.println("Employee init() method");
		}
		 
		@PreDestroy
		public void destroy() {
		  System.out.println("Employee destroy() method");
		}
    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public void afterPropertiesSet() throws Exception {
      System.out.println("Hello Everyone: " + message);
    }
    
    @Override
    public String toString() {
      return "Employee [message=" + message +"]";
    } 
}
