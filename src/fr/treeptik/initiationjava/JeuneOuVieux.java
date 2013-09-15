package fr.treeptik.initiationjava;

import java.util.Scanner;

public class JeuneOuVieux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("quel est votre age");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		
		
		if(age >20){
			System.out.println("vous étes jeunes");
		}else{
			System.out.println("vous étes vieux");
		}

	}

}
