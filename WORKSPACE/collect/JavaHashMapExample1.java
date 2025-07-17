package com.collect;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class JavaHashMapExample1 {
	public static void main(String[] args) {
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("Ashwin", 87.55);
		map.put("Bharat", 95.65);
		map.put("Chetan", 68.13);
		map.put("Dhanjay", 74.23);
		map.put("Kartik", 65.42);
		map.put(null, 74.23);
		map.put("Sandesh", null);
		
		System.out.println("Size Of The Map : " + map.size());
		System.out.println("-----------------");
		
		System.out.println("Size Of The Map : " + map);
		System.out.println("-----------------");
		System.out.println("The elements are :");
		
//		Set<String> set = map.keySet();
//		Iterator<String> keySetIterator = set.iterator();
//
//		while (keySetIterator.hasNext()) {
//			String key = keySetIterator.next();
//			System.out.println(key + "  : " + map.get(key));
//		}
		
		Set<Entry<String, Double>> entry1 =  map.entrySet();
		System.out.println(entry1);
		
		for (Entry<String, Double> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  : " + entry.getValue());
		}

		System.out.println("-----------------");
		System.out.println("Does this map has Chetan as key? " + map.containsKey("Chetan"));
		System.out.println("Does this map has 74.23 as value? " + map.containsValue(74.23));
		System.out.println("-----------------");
		System.out.println("Value removed from the map : " + map.remove("Kartik"));
		
	}
}
