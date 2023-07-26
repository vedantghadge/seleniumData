package java_learning;

import java.util.ArrayList;
import java.util.HashMap;

public class AssignHashmap {

	public static void main (String[]args) {
		String[] s1= {"goa","kerala","gujrat"};
		putvalues(s1);
	}
	public static void putvalues(String[]s1) {
		
		
		  ArrayList<String> a1=new ArrayList<String>(); HashMap<String,String> m1=new
		  HashMap<String,String >(); ArrayList<String> b1=new ArrayList<String>();
		  
		  for(String s:s1) a1.add(s.toUpperCase().substring(0, 3));
		 
	for(String s:s1)
	
	b1.add(s);
	
	for(int i=0;i<a1.size();i++)
	
	  m1.put(a1.get(i),b1.get(i));
	System.out.println(m1);
	
	
	
	}
	
	
}
