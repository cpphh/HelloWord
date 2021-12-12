package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
	//Sap xep theo thu tu key tang dan

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(3, "B");
		map.put(1, "C");
		map.put(2, "A");
		map.put(4, "A");
		
		for(Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getKey() + entry.getValue());
		
		map.put(2, "D");
		System.out.println("\n");
		for(Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getKey() + entry.getValue());
		
		map.remove(2);
		System.out.println("\n");
		for(Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getKey() + entry.getValue());
		
		map.clear();
		
	}
}
