//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.12 at 03:47:43 PM CEST 
//


package fr.treeptik.tpjeu.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nbrVie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="armeActif" type="{http://www.w3schools.com}arme"/>
 *         &lt;element name="armeAPref" type="{http://www.w3schools.com}arme"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type",
    "nbrVie",
    "age",
    "armeActif",
    "armeAPref"
})
@XmlRootElement(name = "personnage")
public class Personnage {

    @XmlElement(required = true)
    protected String type;
    protected int nbrVie;
    protected int age;
    @XmlElement(required = true)
    protected Arme armeActif;
    @XmlElement(required = true)
    protected Arme armeAPref;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the nbrVie property.
     * 
     */
    public int getNbrVie() {
        return nbrVie;
    }

    /**
     * Sets the value of the nbrVie property.
     * 
     */
    public void setNbrVie(int value) {
        this.nbrVie = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the armeActif property.
     * 
     * @return
     *     possible object is
     *     {@link Arme }
     *     
     */
    public Arme getArmeActif() {
        return armeActif;
    }

    /**
     * Sets the value of the armeActif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Arme }
     *     
     */
    public void setArmeActif(Arme value) {
        this.armeActif = value;
    }

    /**
     * Gets the value of the armeAPref property.
     * 
     * @return
     *     possible object is
     *     {@link Arme }
     *     
     */
    public Arme getArmeAPref() {
        return armeAPref;
    }

    /**
     * Sets the value of the armeAPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Arme }
     *     
     */
    public void setArmeAPref(Arme value) {
        this.armeAPref = value;
    }

}
