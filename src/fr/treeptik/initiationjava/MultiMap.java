package fr.treeptik.initiationjava;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MultiMap extends AbstractMap<String, String>{

	HashMap<String, List<String> > map = new HashMap<>();
	
	public String put(String key, String value){
		if (map.containsKey(key)){
			map.get(key).add(value);
		}else{
			ArrayList<String> list = new ArrayList<>();
			map.put(key,  list);
		}
		return null;
	}
	public static void main(String[] args) {
		MultiMap mtMap = new MultiMap();
		mtMap.put("e", "vv");
		mtMap.put("e", "value");

	}
	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
