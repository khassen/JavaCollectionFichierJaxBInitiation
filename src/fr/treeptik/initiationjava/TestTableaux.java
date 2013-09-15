package fr.treeptik.initiationjava;

import java.util.Arrays;

public class TestTableaux {

	
	public static void main(String[] args) {
		
		String[] tab = new String[10];
		System.out.println("la taille du tableau est : " +tab.length);
		tab[0] ="str1";
		System.out.println(tab[0]);
		
		// pour aggrandir le tableau:
		String[] newTab = Arrays.copyOf(tab, 15);
		System.out.println(newTab.length);
		
		String[] strTab = {"t1","t2","t3"};
		System.out.println(strTab.length);
		
		
		

	}

}
