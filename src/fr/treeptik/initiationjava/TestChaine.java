package fr.treeptik.initiationjava;

public class TestChaine {

	public static void main(String[] args) {
		
	String str1 = "Ma super chaine";
	String str2 = "qui tue super";
	String str3 = str1 + " " + str2;
	System.out.println(str3);
	System.out.println("taille de ma chaine" + " "+ str3.length());
	
	char charAt = str3.charAt(1);
	System.out.println(charAt);
	
	String ab ="AB";
	String ba = "ab";
	System.out.println(ab.equalsIgnoreCase(ba));
	
	System.out.println(str3.indexOf("super", 4));
	
	System.out.println(str3.substring(16, 24).trim().length());
	
	//String Builder: c'est un objet qui va permetttre de creer des chaines de charactére.
	
	StringBuilder builder =new StringBuilder();
	builder.append("toto").append("toto").append("toto");
	String chaine = builder.toString();
	System.out.println(chaine);
	
	

	}

}
