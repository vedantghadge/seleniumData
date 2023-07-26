package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PracticeFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	File file=new File("D:\\eclipse demo\\selenium_2021\\Resources\\myfilewitePractice.properties");
	FileWriter writer=new FileWriter(file);
	Properties prop=new Properties();
	prop.setProperty("Role","Software Tester");
	prop.store(writer, "Updated Role");	
		
		
		
		
		
		
		
		
		
	}

}
