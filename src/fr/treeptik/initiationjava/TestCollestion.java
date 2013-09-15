package fr.treeptik.initiationjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestCollestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>(50);
		arrayList.add("chaine1");
		arrayList.add("chaine2");
		arrayList.add("chaine3");

		System.out.println("taille de la liste : " + arrayList.size());

		System.out.println(arrayList.get(1));

		arrayList.remove(1);

		System.out.println("taille de la liste : " + arrayList.size());

		System.out.println(arrayList.contains("chaine1"));

		arrayList.ensureCapacity(100);
		// optimiser la taille

		arrayList.trimToSize();

		for (String string : arrayList) {
			System.out.println(string);
		}

		for (int i = 0; i < arrayList.size(); i += 2) {
			System.out.println(arrayList.get(i));
		}

		// objet pour parcourir la list
		Iterator<String> iterator = arrayList.iterator();
		for (int i = 0; i < arrayList.size(); i += 2) {
			System.out.println(iterator.next());
		}

		// LinkedList

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("dd");
		linkedList.add("aa");
		linkedList.add("cc");

		System.out.println(linkedList.get(1));
		// pour trier la liste
		Collections.sort(linkedList);
		//inverser la liste
		Collections.reverse(linkedList);
		
		for (String string : linkedList) {

			System.out.println(linkedList);

		}
		linkedList.descendingIterator();

		// Set: pareil que la liste mais ca n'accepte pas la liste

		HashSet<String> hasSet = new HashSet<>();
		hasSet.addAll(arrayList);

		System.out.println(hasSet.size());

		// Tree Set: trier en permanence, mettre en ordre

		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("e");
		treeSet.add("a");
		treeSet.add("c");
		treeSet.add("d");
		treeSet.add("b");

		for (String string : treeSet) {
			System.out.println(string);

		}

		// Map: c un collection qui va me permettre de porter deux type de
		// donnée : clé/valeur
		// # list: que la valeur
		// les clés sont uniques dans une map

		// HashMap<String, String> hashMap = new HashMap<>();
		// pour garder l'ordre
		LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
		hashMap.put("cle1", "valeur1");
		hashMap.put("cle2", "valeur2");
		hashMap.put("cle3", "valeur3");

		System.out.println(hashMap.size());
		System.out.println(hashMap.get("cle1"));

		System.out.println(hashMap);

		// recuperer les cles et les valeurs:

		Set<String> keySet = hashMap.keySet();

		for (String key : keySet) {
			System.out.println("cle : " + key + "valeur : " + hashMap.get(key));
		}

		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("e", "cv");
		treeMap.put("a", "cg");

		System.out.println(treeMap);

	}

}
