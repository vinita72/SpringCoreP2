package com.InjectionCollection.InjectionCollection;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int Questionid;  
	private String name;  
	private List<String> answers;  
	  
	public Question() {}  
	public Question(int Questionid, String name, List<String> answers) {  
	    super();  
	    this.Questionid = Questionid;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	  
	public void display(){  
	    System.out.println(Questionid+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
}
