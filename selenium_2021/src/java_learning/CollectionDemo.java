package java_learning;

import java.util.ArrayList;
import java.util.List;


public class CollectionDemo {
	
	//static int arr[]=new int[2];
	
	//static int arr1[]= {1,2,3};
	
	static List<Integer> list=new ArrayList<>();
	
	public static void main(String[] args) {
	
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		 }
	}


