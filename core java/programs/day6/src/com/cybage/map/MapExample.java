package com.cybage.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> capitals = new HashMap<>();
		Map<String, Long> population = new HashMap<>();
		
		capitals.put("MH", "mumbai");
		capitals.put("GJ", "gandhinagar");
		capitals.put("TL", "hyd");
		capitals.put("AP", "hyd");
		capitals.put("TN", "chennnai");
		capitals.put("PB", "chandigarh");
		
		System.out.println(capitals);
		
		//get only keys
		Set<String> state = capitals.keySet();
		System.out.println(state);
		
		//get only values
		Collection<String> capital = capitals.values();
		System.out.println(capital);
		
		System.out.println(capitals.containsKey("MH"));
		
		
	}
}
