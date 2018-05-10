import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CountriesTextFile {
	public static class FileMethod {
		public static ArrayList<CountriesApp> readFromFile() {
			Path readFile = Paths.get("resources/Country.txt");
			File file = readFile.toFile();
			ArrayList<CountriesApp> emp = new ArrayList<>();

			try {
				FileReader fr = new FileReader(file);

				BufferedReader reader = new BufferedReader(fr);
				String arr[] = new String[3];
				String line = reader.readLine();
				while (line != null) {

					arr = line.split(",");
					// System.out.println(array);
					CountriesApp country = new CountriesApp(arr[0], arr[1], arr[2]);

					emp.add(country);

					line = reader.readLine();
				}

				reader.close();
			} catch (IOException e) {
				System.out.println("Something bad happened...");

			}
			return emp;
		}

		public static void writeToFile(CountriesApp emp, String dir, String fileName) {

			Path writeFile = Paths.get(dir, fileName);
			File file = writeFile.toFile();

			try {
				PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));
				outW.println(emp);
				outW.close();// flush data
			} catch (FileNotFoundException e) {
				System.out.println("The file was not found here...");
				e.printStackTrace();
			}
		}

		public static void createFile(String dirString, String fileString) {

			Path filePath = Paths.get(dirString, fileString);

			if (Files.notExists(filePath)) {
				try {
					Files.createFile(filePath);
					System.out.println("Your file was created successfully");
				} catch (IOException e) {
					System.out.println("Something went wrong with the file creation");
					e.printStackTrace();
				}
			}
			System.out.println("File Name: " + filePath.getFileName());
			System.out.println("Absolute: " + filePath.toAbsolutePath());
		}

		public static void createDirectory(String path) {

		}

		Path dirPath = Paths.get(path);

		if(Files.notExists(dirPath))
		{

				try {
					Files.createDirectories(dirPath);
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Something went wrong");
				}
			}

}|
