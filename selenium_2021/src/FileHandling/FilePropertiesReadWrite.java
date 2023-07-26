package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class FilePropertiesReadWrite {

	public static void main(String[] args) throws IOException {

		writeIntoProperties();

		readPropFile();

	}

	public static void writeIntoProperties() throws IOException {

		File file = new File("D:\\eclipse demo\\selenium_2021\\Resources\\myfile1.properties");
		FileWriter fis = new FileWriter(file);
		Properties prop = new Properties();
		prop.setProperty("timing", "10 to 1");
		prop.setProperty("technology", "java with selenium");
		prop.setProperty("name", "Sachin");
		prop.store(fis, "updateRole");
		System.out.println("updated succesfully");

	
	}

	public static void readPropFile() throws IOException {
		File file = new File("D:\\eclipse demo\\selenium_2021\\Resources\\myfile1.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.stringPropertyNames());

		Set<String> set = prop.stringPropertyNames();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
		System.out.println(prop.getProperty(itr.next()));
		}
//		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("technology"));
//		System.out.println(prop.getProperty("timing"));

	}

}
