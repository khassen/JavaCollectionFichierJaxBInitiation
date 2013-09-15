package fr.treeptik.initiationjava.tpJeu;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//ma classe va etre executer par junit
@RunWith(JUnit4.class)
public class TestPersonnage {

	// pour tester je vais faire une methode
	@Test(expected = NullPointerException.class)
	// cette methode est cencée declancher un exception si il y a une erreur
	// nullPointerException
	public void testAttaquerParamNull() {
		Magicien magicien = new Magicien(10, 50, new Baguette(25), new Epee(12));
		magicien.attaquer(null);
	}

	@Test
	// on peut ignorer le test
	@Ignore
	public void testAttaquerOk() {
		Magicien magicien = new Magicien(10, 50, new Baguette(25), new Epee(12));
		Chevalier chevalier = new Chevalier(10, 50, new Epee(18), new Baguette(
				20));
		int nbrVie = magicien.attaquer(chevalier);

		// pour l'egalité entre 2 objets ou verifier le retour

		Assert.assertEquals(10, nbrVie);
		Assert.assertEquals(10, chevalier.getNbrVie().intValue());
	}

}
