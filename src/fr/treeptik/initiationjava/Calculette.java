package fr.treeptik.initiationjava;

import java.util.Scanner;

public class Calculette {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
       Scanner scanner = new Scanner (System.in);

       
       System.out.println("tappez  l'entier numero 1");
       
       int entier1 = scanner.nextInt();
       
       System.out.println("tappez  l'entier numero 2");
       int entier2 = scanner.nextInt();
       
       int somme = entier1 + entier2;
       
       System.out.println("la somme de l'entier1 est l'entier2 est :" + somme);
	}    
       
		

}
