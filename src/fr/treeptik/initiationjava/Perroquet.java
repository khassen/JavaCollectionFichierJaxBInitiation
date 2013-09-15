package fr.treeptik.initiationjava;

import java.util.Scanner;

public class Perroquet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String mot = null;
		 do { 
			 System.out.println("Taper un mot : ");
			 mot = sc.next();
			 System.out.println(mot);
		 }

		while (!"quit".equalsIgnoreCase(mot));

		}

		

	}

