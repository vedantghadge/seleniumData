package FileHandling;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PracticeFileReader {

	public static void main(String[] args) throws IOException {


		
	File file=new File("D:\\eclipse demo\\selenium_2021\\Resources\\Mynewfile.Properties");
	FileInputStream fis=new FileInputStream(file);
	Properties prop=new Properties();	
	prop.load(fis);	
	System.out.println(prop.getProperty("Name"));	
	System.out.println(prop.getProperty("Post"));
		
		
		
		
		
		
		

	}

}
