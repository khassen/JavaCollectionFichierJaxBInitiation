package fr.treeptik.initiationjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProporties {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
	Properties properties = new Properties();
	//telecharger le fichier
	properties.load(new FileReader(new File("Application.proporties")));
	
	String property = properties.getProperty("ma.super.cle");
	System.out.println(property);
	
	}

}
