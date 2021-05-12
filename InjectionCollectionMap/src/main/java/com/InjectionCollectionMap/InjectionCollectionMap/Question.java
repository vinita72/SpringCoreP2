package com.InjectionCollectionMap.InjectionCollectionMap;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question {
	private int Questionid;  
	private String name;  
	private Map <String, String> answers;  
	  
	public Question() {}  
	public Question(int Questionid, String name, Map <String, String>answers) {  
	    super();  
	    this.Questionid = Questionid;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	  
	 void display(){  
	    System.out.println(Questionid+" "+name);  
	    System.out.println("answers are:");  
	    Collection<java.util.Map.Entry<String,String>> set=answers.entrySet();  
	    Iterator<java.util.Map.Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
}
