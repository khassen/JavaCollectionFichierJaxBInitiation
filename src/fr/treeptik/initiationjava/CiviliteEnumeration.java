package fr.treeptik.initiationjava;

public enum CiviliteEnumeration {

	Monsieur(1, "ae"), Madame(2,"er" ), Docteur(3, "rt");
	// ca ne pas etre en dehors de l'enumeration
	private Integer value;

	private String chaine;
	//construire mon enuration, on ne peut la creer en dehorsde l'enum
	private CiviliteEnumeration(Integer value, String chaine) {
		this.value = value;
		this.chaine = chaine;
	}
	
	public Integer getValue() {
		return value;
	}
	public String getChaine() {
		return chaine;
	}
	
}
