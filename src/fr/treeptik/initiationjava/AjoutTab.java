package fr.treeptik.initiationjava;

import java.util.Arrays;

public class AjoutTab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		String[] tab = new String[5];

		for (int i = 0; i < 2; i++) {
			tab = ajouteTableau(tab, "Value1" + i);
			System.out.println(tab.length);
		}
	}

	

	public static String[] ajouteTableau(String[] tab, String value) {
		boolean ajoute = false;
//		if(tab[tab.length - 1] != null]){
//			tab = Arrays.copyOf(tab, tab.length + 5);
//		}
		for (int i = 0; i < tab.length; i++) {

			if (tab[i] == null) {
				tab[i] = value;
				ajoute = true;
				break;
			}
		}
		if (ajoute == false) {
			String[] newTab = new String[tab.length + 5];
			System.arraycopy(tab, 0, newTab, 0, tab.length);
			newTab[tab.length + 1] = value;
			tab = newTab;
		}

		return tab;

	}

	}

