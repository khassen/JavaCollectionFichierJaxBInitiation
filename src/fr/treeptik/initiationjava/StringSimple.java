package fr.treeptik.initiationjava;

import java.util.Scanner;

public class StringSimple {

	/*public static void decoupe( String str){
		Scanner scanner = new Scanner(System.in);
		System.out.println("tappez un mot");
		String mot = scanner.nextLine();
		
		String[] tab = mot.split(" ");
	
		
		for (int i = 0; i < tab.length ; i = i+2){
			
			tab[i+2].toUpperCase();
			tab[i+1].toLowerCase();	
			System.out.println(tab[i]);
			}	
		
	}
	
	public static String miroir(String str){
		
		
		return str;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	}*/
	public static void main(String[] args) {
		String result = upperCaseLowerCase("rouge vert bleu jaune blanc");
		System.out.println(result);
		System.out.println(result.substring(19, 24));

		System.out.println(reverse(result));
		System.out.println(decoupage("rouge"));
	}
	

	public static String upperCaseLowerCase(String string) {
		String[] mots = string.split(" ");
		String result = "";
		for (int i = 0; i < mots.length; i = i + 2) {
			result = result + mots[i].toLowerCase() + " ";
			if (i + 1 < mots.length) {
				result = result + mots[i + 1].toUpperCase() + " ";
			}

		}

		return result;
	}

	public static String reverse(String string) {
		String result = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			result = result + string.charAt(i);
		}
		return result;
	}
	public static String decoupage (String mot){
		StringBuilder builder = new StringBuilder();
		
		mot = mot.toUpperCase();
		for (int i=0; i<mot.length(); i++){
			//concactene la chaine de caract
			builder.append("-").append(mot.charAt(i));
		}
		//retourne la chaine de char contenue dans le builder
		String result = builder.toString();
		result = result.replaceFirst("-", " ");
		//met en maj
		return result.toUpperCase();
		
	}

}
