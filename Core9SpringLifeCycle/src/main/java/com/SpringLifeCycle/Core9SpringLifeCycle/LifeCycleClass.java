package com.SpringLifeCycle.Core9SpringLifeCycle;

public class LifeCycleClass {

	
	public void init() throws Exception
    {
        System.out.println(
            "LifeCycle"
            + "instantiated"
            + "init() method");
    }
  
    // This method executes
    // when the spring container
    // is closed
    public void destroy() throws Exception
    {
        System.out.println(
            "Conatiner closed "
            + "destroy() method");
    }
}
