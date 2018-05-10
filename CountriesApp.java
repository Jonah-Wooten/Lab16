import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.Validator;

import CountriesTextFile.FileMethod;

public class CountriesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String name;
		
		

		ArrayList<CountriesApp> employeeList;

		String dir = "resources";
		String fileName = "Coutries.txt";

		FileMethod.createDirectory(dir);
		FileMethod.createFile(dir, fileName);

		name = Validator.getString(scan, "Enter Name:");
	


		CountryApp = FileMethod.readFromFile();
		System.out.println(employeeList);
		scan.close();
	}
		
		
	}

}
