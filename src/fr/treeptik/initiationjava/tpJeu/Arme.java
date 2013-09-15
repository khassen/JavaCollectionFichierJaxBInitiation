package fr.treeptik.initiationjava.tpJeu;

public abstract class Arme {

	// donnée menbre, pas de constructeur sans parametre 
	//pour obliger l'initialisation de l'arme avec la donnée menbre poinDeDega
	private Integer pointDeDega;

	public Arme(Integer pointDeDega) {
		super();
		this.pointDeDega = pointDeDega;
	}

	public Integer getPointDeDega() {
		return pointDeDega;
	}

	public void setPointDeDega(Integer pointDeDega) {
		this.pointDeDega = pointDeDega;
	}

}
