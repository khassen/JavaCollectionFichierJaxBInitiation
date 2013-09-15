package fr.treeptik.initiationjava.fichier;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class WriteRuntim {

	/**
	 * @param args
	 * @throws DatatypeConfigurationException 
	 */

	@SuppressWarnings("null")
	public static void main(String[] args) throws JAXBException, DatatypeConfigurationException {
		JAXBContext context = JAXBContext
				.newInstance("fr.treeptik.initiationjava.fichier");

		Personne p1 = new Personne();
        //date to XMLGregorianCalandar
		Date date = new Date();
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		gregorianCalendar.setTime(date);

		DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();

		XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory
				.newXMLGregorianCalendar(gregorianCalendar);
		//XMLGregorianCalandar to XML
//		
//		Date date2 = xmlGregorianCalendar.toGregorianCalendar();
//		
		
		System.out.println("saisissez le nom de la personne");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("saisissez le prenom de la personne");
		String prenom = scanner.nextLine();
		p1.setNom(name);
		p1.setPrenom(prenom);
		Annuaire listPerson = null;
//		listPerson.getPersonne().add(p1);

		// j'ecris un fichier
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(listPerson, new File("newPerson.xml"));

		// Personne p1 = new Personne("alexi", "cho");
		// Personne p2 = new Personne("mido", "aho");
		// Personne p3 = new Personne("belo", "lol");
		// Personne p4 = new Personne("sami", "mam");

	}
}
