package fr.treeptik.initiationjava.fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



public class FichierTexte {

	@SuppressWarnings("resource")
	public static void ecrireDansUnFichier(String fichier, String saisie) throws IOException{


		File file = new File("fichier.txt");
		if(!file.exists()){
			file.createNewFile();
		}
        
	
		FileWriter fileWriter = new FileWriter("fichier.txt", true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(saisie);
		bufferedWriter.newLine();
		bufferedWriter.flush();
		bufferedWriter.close();
		fileWriter.close();
	}
	
	public static void lireUnFichier(String fichier) throws IOException{
		FileReader fileReader = new FileReader("fichier");
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(fileReader);
	while(bufferedReader.ready()){
		System.out.println(bufferedReader.readLine());
	}
	bufferedReader.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez le nom du fichier");
		String nomFichier = scanner.nextLine();
		System.out.println("Taper votre saisie");
		String saisie = scanner.nextLine();
		
		FichierTexte.ecrireDansUnFichier(nomFichier, saisie);
		FichierTexte.lireUnFichier(nomFichier);

	}


}
