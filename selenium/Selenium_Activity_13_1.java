package Selenium_Java_Activities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.util.Iterator;
import java.util.List;

public class Selenium_Activity_13_1 {

	public static void main(String args[]) throws IOException, CsvException {
		CSVReader reader = new CSVReader(new FileReader("src/sample.csv"));
		List<String[]> list = reader.readAll();
		System.out.println("Size of all the elements in input file: "+list.size());

		Iterator<String[]> elements = list.iterator();
		while(elements.hasNext()) {
			String[] str = elements.next();
			System.out.print("Elements are: ");
			for(int i=0;i<str.length;i++) {
				System.out.print(" " + str[i]);
			}
			System.out.println(" ");
		}
		reader.close();
	}
}

