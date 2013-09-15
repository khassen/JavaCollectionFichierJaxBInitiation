package fr.treeptik.initiationjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {

		HashMap<String, String[]> hashMap = new HashMap<>();
		String[] tab = { "r", "yy", "oi" };
		String[] tab1 = { "dr", "jyy", "oi" };
		String[] tab2 = { "ggr", "zyy", "oi" };

		hashMap.put("aa", tab);
		hashMap.put("bb", tab1);
		hashMap.put("cc", tab2);
		afficheElement(hashMap);

	}

	public static void afficheElement(Map<String, String[]> hashMap){
		
	
		
		Set<String> keySet = hashMap.keySet();
		for (String key : keySet) {
         String[] tabl = hashMap.get(key); 
			for( int i = 0;i < hashMap.get(key).length;i++){
				System.out.println("cle : "+key +" - valeur : "+tabl[i]);
			}
			
					
		}
		
		
		
	}
}
