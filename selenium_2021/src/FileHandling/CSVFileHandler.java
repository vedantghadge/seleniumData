package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CSVFileHandler {  
	static String homepath = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		readerCSVFile();

	}

	private static void readerCSVFile() throws IOException {

		File file = new File(homepath + "\\Resources\\Data.csv");
		FileReader filereader = new FileReader(file);
		BufferedReader reader = new BufferedReader(filereader);

		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);

		}
		filereader.close();

	}

	public static void writeCSVFile() throws IOException {

		File file = new File(homepath + "\\Resources\\Data.csv");
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
