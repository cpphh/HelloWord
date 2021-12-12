package set;

import java.util.LinkedHashSet;
import java.util.Set;

import list.Person;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new LinkedHashSet<Person>();
		set.add(new Person(2, "cuong"));
		set.add(new Person(3, "duy"));
		Person person = new Person(1, "tuan");
		set.add(person);
		set.add(new Person(3, "duy"));
		
		for(Person p : set)
			System.out.println(p.toString());
		
		System.out.println("\n");
		set.remove(new Person(2, "cu"));
		for(Person p : set)
			System.out.println(p.toString());

	}

}
