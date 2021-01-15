package com.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextManipulation {
	int noOfInputs;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	FileWriter writer;
	BufferedWriter bufferedWriter;
	FileReader fileReader;
	String line;

	public void getInputSize() throws NumberFormatException, IOException {
		System.out.println("Enter size:");
		noOfInputs = Integer.parseInt(reader.readLine());
	}

	public void writeFile() {

		try {
			getInputSize();
			writer = new FileWriter("//Users//kajalthakur//Desktop//MyFile.txt", true);

			bufferedWriter = new BufferedWriter(writer);
			for (int i = 0; i < noOfInputs; i++) {

				System.out.println("Enter Name");
				bufferedWriter.write(reader.readLine());
				bufferedWriter.newLine();
				System.out.println("Enter ID");
				bufferedWriter.write(reader.readLine());
				bufferedWriter.newLine();
				System.out.println("Enter Designation");
				bufferedWriter.write(reader.readLine());
				bufferedWriter.newLine();

			}

			System.out.println("Data entered sucessfully inside text file.");
			bufferedWriter.close();
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readFile() {
		try {
			fileReader = new FileReader("//Users//kajalthakur//Desktop//MyFile.txt");
			reader = new BufferedReader(fileReader);
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
