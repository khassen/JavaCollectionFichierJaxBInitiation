package fr.treeptik.initiationjava.fichier;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLDOM {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws Exception 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, Exception {
		// TODO Auto-generated method stub
		File file = new File("personnage.xml");
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = db.parse(file);
		Element element = doc .getDocumentElement();
		XPath newXPath = XPathFactory.newInstance().newXPath();
		String evaluate = newXPath.evaluate("/listPerso/personnage/type", element);
		System.out.println(evaluate);      
		XPathExpression xpExpression = newXPath.compile("//personnage[type='M']");
		
		NodeList list = (NodeList) xpExpression.evaluate(element, XPathConstants.NODESET);
		for (int i = 0; i<list.getLength();i++) {
			Node node = list.item(i);
			System.out.println(node.getTextContent());
			
		}
		

	}

}
