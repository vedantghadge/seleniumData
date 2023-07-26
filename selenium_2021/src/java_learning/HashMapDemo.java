package java_learning;

import java.util.HashMap;

public class HashMapDemo {

	static HashMap<String,String> map=new HashMap<>();
	
	 public static void main(String[] args) {
     
		 map.put("FirstName", "Sachin");
		 map.put("LastName", "Tendulkar");
		 map.put("Passion", "Cricket");
		 
		 System.out.println(map);
		 }

}
