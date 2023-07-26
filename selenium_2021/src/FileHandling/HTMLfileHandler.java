package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLfileHandler {
	static String homepath = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		readHTMLFile();
		//writeHTMLFile();
	}

	public static void writeHTMLFile() throws IOException {

		File file = new File(homepath + "\\Resources\\SampleTest.html");
		FileWriter writter = new FileWriter(file);
		BufferedWriter bwriter = new BufferedWriter(writter);

		bwriter.write("<!DOCTYPE html>\r\n" + "<html>"

				+ "<head>" + "<title>Selenium Automation</title>" + "</head>"

				+ "<body>" + "<h1>This is selenium site tutorial </h1>" + "<p>This is a paragraph </p>" + "</body> "

				+ "</html>");

		bwriter.flush();
		writter.close();
		System.out.println("File has Created and Updated");
	}

	public static void readHTMLFile() throws IOException {
	
	File file =new File (homepath+"\\Resources\\SampleTest.html");
	FileReader fileReader =new FileReader(file);
	BufferedReader reader = new BufferedReader (fileReader);
	
	
	String line=  "  ";
	while ((line=reader.readLine())!=null) {
		System.out.println(line);
		
		
		
	}
	
	fileReader.close();
}

}