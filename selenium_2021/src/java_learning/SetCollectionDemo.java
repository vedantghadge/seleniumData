package java_learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCollectionDemo {

  static  Set<String> set=new HashSet<String>();
  static  List<String> list=new ArrayList<String>();

	public static void main(String[] args) {
		
	    set.add("Rohan");		

		set.add("Rohan");		
		set.add("Mohan");		
		set.add("Akshay");		
		set.add("Ganesh");		
		set.add("Yogesh");		
		
    System.out.println(set);
    
    list.add("Rohan");		
    list.add("Mohan");		
    list.add("Akshay");		
    list.add("Ganesh");		
    list.add("Yogesh");	
	list.add("Rohan");		
    System.out.println(list);

	}

}
