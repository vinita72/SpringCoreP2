package com.InjectionCollectionSet.InjectionCollectionSet;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Question {

	private int Questionid;  
	private String name;  
	private Set<String> answers;  
	  
	public Question() {}  
	public Question(int Questionid, String name, Set <String> answers) {  
	    super();  
	    this.Questionid = Questionid;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	  
	 void display(){  
	    System.out.println(Questionid+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
}
