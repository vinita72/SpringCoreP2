package com.InitializingDisposableBean.Core8Bean;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
String message;
    
    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public void afterPropertiesSet() throws Exception {
      System.out.println("Hello Everyone: " + message);
    }
    
    public void destroy() throws Exception {
      System.out.println("using Initialzing bean and disposable bean");
    }
}
