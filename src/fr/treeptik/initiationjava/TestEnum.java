package fr.treeptik.initiationjava;

public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CiviliteEnumeration monsieur = CiviliteEnumeration.Monsieur;
		//on prefere le name
		System.out.println(monsieur.name());
		//retourne le numero de l'enumeration
		System.out.println(monsieur.ordinal());
		
		monsieur.getChaine();

	}

}
