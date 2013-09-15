package fr.treeptik.initiationjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("aa");
		arrayList.add("bb");
		arrayList.add("cc");
		arrayList.add("dd");
		long td = System.nanoTime();
		for (String string : arrayList) {
			System.out.println(string);
		}
		long tf = System.nanoTime();
		System.out.println(tf - td);

		affichInverse(arrayList);
		trieListOrdreAlpha(arrayList);

		Set<String> set = new HashSet<>();
		set.add("CC");
		set.add("BB");
		set.add("DD");
	set.add("BB");		
		set.add("AA");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		LinkedList<String> listeChaine = new LinkedList<>();
		listeChaine.add("aa");
		listeChaine.add("bb");
		listeChaine.add("cc");
		listeChaine.add("dd");
		long td1 = System.nanoTime();
		Iterator<String> iterator1 = listeChaine.iterator();
		while (iterator1.hasNext()) {
			System.out.println("objet = " + iterator1.next());
		}
		long tf1 = System.nanoTime();

		System.out.println(tf1 - td1);
     // creer une liste non typée et qui est rempli directement sans ad
		List<String> values = Arrays.asList("fdd", "fgdfg");
	}

	public static void affichInverse(ArrayList<String> listChaine) {

		Collections.reverse(listChaine);
		for (String string : listChaine) {
			System.out.println(string);
		}
	}

	public static void trieListOrdreAlpha(ArrayList<String> arrayList) {

		Collections.sort(arrayList);
		Collections.reverse(arrayList);

		for (String string : arrayList) {
			System.out.println(string);
		}
	}

}
