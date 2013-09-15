package fr.treeptik.initiationjava.fichier;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialisationFichier implements Serializable{
    

	
	public static void main(String[] args) {
		
		Patron person = new Patron("alex","lolo");
		System.out.println(person);
		
		try{
		File file = new File("personne.objet");
		FileOutputStream fos =new FileOutputStream(file);
		@SuppressWarnings("resource")
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		oos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
