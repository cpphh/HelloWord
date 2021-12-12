package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import list.Person;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Co key duy nhat co the la null
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "cuong");
		map.put(1, "duy");
		map.put(2, "tuan");
		map.put(null, "tung");
		//sua xoa
		map.put(3, "nam");
		map.remove(2);
		
		Set<Integer> set = map.keySet();
		for(Integer i : set)
			System.out.println(i + " " + map.get(i));
		
		System.out.println("\n");
		for(Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getKey() + entry.getValue());
		
		Map<String, Person> mapPerson = new HashMap<String, Person>();
		mapPerson.put("a", new Person(1, "Cuong"));
		mapPerson.put("c", new Person(2, "Cuong"));
		mapPerson.put("b", new Person(3, "Cuong"));
		
		System.out.println(mapPerson.get("a"));
		for(Entry<String, Person> entry : mapPerson.entrySet())
			System.out.println(entry.getKey() + entry.getValue());
			

	}

}
