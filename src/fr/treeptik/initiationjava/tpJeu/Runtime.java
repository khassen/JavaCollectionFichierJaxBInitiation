package fr.treeptik.initiationjava.tpJeu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Runtime {

	public static final Random random = new Random();

	public static Personnage tirerUnCombattant(ArrayList<Personnage> list1) {

		return list1.get(random.nextInt(list1.size()));

	}

	public static void main(String[] args) {
		HashMap<String, ArrayList<Personnage>> mapPartie = new HashMap<>();

		ArrayList<Personnage> personnage = new ArrayList<>();
		ArrayList<Personnage> personnage1 = new ArrayList<>();

		Gordin gord = new Gordin(14);
		Baguette bag = new Baguette(20);
		Epee ep = new Epee(5);

		Elfe elf1 = new Elfe(50, 20, gord, bag);
		Elfe elf2 = new Elfe(40, 20, gord, bag);
		Elfe elf3 = new Elfe(54, 20, gord, bag);
		Elfe elf4 = new Elfe(30, 20, gord, bag);

		Magicien mg1 = new Magicien(55, 45, bag, ep);
		Magicien mg2 = new Magicien(55, 35, bag, ep);
		Magicien mg3 = new Magicien(55, 85, bag, ep);
		Magicien mg4 = new Magicien(55, 25, bag, ep);

		Chevalier ch1 = new Chevalier(40, 30, ep, gord);
		Chevalier ch2 = new Chevalier(40, 30, ep, gord);
		Chevalier ch3 = new Chevalier(40, 30, ep, gord);
		Chevalier ch4 = new Chevalier(40, 30, ep, gord);

		personnage.add(elf4);
		personnage.add(mg3);
		personnage.add(ch3);
		personnage.add(mg3);

//		for (Personnage personnage2 : personnage) {
//			if (personnage2.getNbrVie() == 0) {
//				personnage.remove(personnage2);
//			}
//			personnage1.addAll(personnage);
//		}

		mapPartie.put("parti 1", personnage);

		Set<String> keySet = mapPartie.keySet();

		for (String key : keySet) {
			System.out.println("cle : " + key + "valeur : "
					+ mapPartie.get(key));

			int i = 0;
			Personnage p1;
			Personnage p2;

			while (personnage.size() > 1) {
				
				p1 = tirerUnCombattant(personnage);
				personnage1.remove(p1);
				p2 = tirerUnCombattant(personnage);
				
				int result = p1.attaquer(p2);
				
				if(result<=0){
					System.out.println("**** "+p2.getAge());
					personnage.remove(p2);
					System.out.println(personnage.size() + "----***");
				}i++;

			}

		}

	}

	
//	String line = bufferedReadline.readline();
//	Strin[] person
	//remplir le tableau
}
