package fr.treeptik.initiationjava.fichier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FichierCopier {
	
	
	public static void main(String[] args) throws IOException{
		

		File file = new File("fichierCopy.txt");
		if(!file.exists()){
			file.createNewFile();
		}
        

        String file1 = "fichier.txt";
        FileInputStream source = new FileInputStream(file1);
        FileOutputStream destination = new FileOutputStream("/home/stagiaire/workspace1/InitiationJava/fichierCopy.txt");
 
        FileChannel sourceFileChannel = source.getChannel();
        FileChannel destinationFileChannel = destination.getChannel();
 
        long size = sourceFileChannel.size();
        sourceFileChannel.transferTo(0, size,destinationFileChannel);
        sourceFileChannel.close();
        destinationFileChannel.close();
        
	}

}
