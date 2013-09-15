package fr.treeptik.initiationjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {


	public static void main(String[] args) throws IOException {
		
		File file = new File("superFile.txt");
		if(!file.exists()){
			file.createNewFile();
		}
        
		FileWriter fileWriter = new FileWriter(file, true);
		for(int i = 0; i<10;i++){
			fileWriter.write("ligne"+i+System.getProperty("Line.separator"));
			
		}
		fileWriter.close();
		
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		while(bufferedReader.ready()){
			System.out.println(bufferedReader.readLine() );
		}
		bufferedReader.close();
	}

}
