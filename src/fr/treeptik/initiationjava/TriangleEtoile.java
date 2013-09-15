package fr.treeptik.initiationjava;

import java.util.Scanner;

public class TriangleEtoile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nombre d'étoiles :");
		int nbrEtoile = sc.nextInt();
		

		for (int i = 0; i < nbrEtoile; i++) {
			//un for pour afficher les blancs
			for (int j = 0; j < nbrEtoile - i -1; j++) {
            	System.out.print(" ");
            	
            	
//				
//				StringBuilder builder = new StringBuilder();
//				System.out.print("*"+builder.append(" "));

			}
			for (int j = 0; j < i*2 + 1; j++) {
            	System.out.print("*");
			}
			System.out.println(" ");
		}
		
	} 
      


  	

}
