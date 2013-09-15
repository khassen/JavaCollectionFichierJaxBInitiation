package fr.treeptik.initiationjava.tpJeu;

public abstract class Personnage {

	private Integer nbrVie = 0;
	private Integer age = 0;
	private Arme armeA;
	private Arme armeP;

	public Personnage(Integer nbrVie, Integer age, Arme armeA, Arme armeP) {
		super(); // appel le constructeur de la classe mere
		this.nbrVie = nbrVie;
		this.age = age;
		this.armeA = armeA;
		this.armeP = armeP;
	}

	public int attaquer(Personnage perso) {
      
		
		
			if (this.armeA.getPointDeDega() == perso.armeP.getPointDeDega()) {
				
				this.nbrVie = nbrVie - perso.armeA.getPointDeDega();
				//perso.setNbreVie(NbreVie -armeA.get(PointDeDeaga))
			} else {
				this.nbrVie = nbrVie - (perso.armeA.getPointDeDega()) / 2;
			}


		return perso.getNbrVie();

	}

	
	public Integer getNbrVie() {
		return nbrVie;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


   

}
