package fr.treeptik.initiationjava.fichier;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FichierProperties {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		Properties properties = new Properties();
		properties.load(new FileReader("Application.proporties"));
		
		String property = properties.getProperty("ma.super.cle");
		System.out.println(property);
	}

}
