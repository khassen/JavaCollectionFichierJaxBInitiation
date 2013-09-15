package fr.treeptik.tpjeu.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class FichierXML {

	/**
	 * @param args
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws JAXBException {

		// on va recuperer le jaxbcontext pour lire le fichier xml
		JAXBContext context = JAXBContext.newInstance("fr.treeptik.tpjeu.xml");
		// l'objet qui convertit de xml en java (transformer)
		Unmarshaller unmarshaller = context.createUnmarshaller();
		ListPerso listPerso = (ListPerso) unmarshaller.unmarshal(new File(
				"personnage1.xml"));
		System.out.println("nb de personnage : "
				+ listPerso.getPersonnage().size());

		Personnage personnage2 = new Personnage();
		personnage2.setType("M");
		personnage2.setNbrVie(100);

		// lire un fichier
		fr.treeptik.tpjeu.xml.Arme armeA = new Arme();
		armeA.setPoint(10);
		armeA.setType("g");

		personnage2.setArmeActif(armeA);

		listPerso.getPersonnage().add(personnage2);

		// j'ecris un fichier
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(listPerso, new File("newPersonnages.xml"));

	}
}
