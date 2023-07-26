package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TextFileHandler {

	static String homepath = System.getProperty("user.dir");
    static List<String> list=new ArrayList();
    
	public static void main(String[] args) throws IOException {
		
		readerTextFile() ;
		System.out.println("updated list-"+ list);
		
	}
	private static void readerTextFile() throws IOException {
	
		File file = new File(homepath + "\\Resources\\Demo.txt");
     FileReader filereader=new FileReader(file);
     BufferedReader reader=new BufferedReader(filereader);
     
     
     String line="";
     while((line=reader.readLine())!=null) {
     System.out.println(line);
     list.add(line);
     }
     filereader.close();	
		
	}
	public static void writeTextFile() throws IOException {

		File file = new File(homepath + "\\Resources\\Demo.txt");
		FileWriter writter = new FileWriter(file, false);
		BufferedWriter bwriter = new BufferedWriter(writter);

		for (int i = 0; i < 5; i++) {

			Random random = new Random();
			int d = random.nextInt(100);

			bwriter.write("Number is :-" + d);
			bwriter.newLine();
		}

		/*
		 * bwriter.write("FirstLine"); bwriter.newLine(); bwriter.write("sample text");
		 */

		bwriter.flush();
		writter.close();
		System.out.println("file has created ad updated");

	}

}
