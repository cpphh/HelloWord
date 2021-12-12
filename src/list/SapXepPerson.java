package list;

import java.util.Collections;
import java.util.List;

public class SapXepPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new java.util.ArrayList<Person>();
		Person p1, p2, p3;
		p1 = new Person(1, "cuong");
		p2 = new Person(3, "duy");
		p3 = new Person(4, "tuan");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(new Person(2, "tung"));
		
		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i).toString());
		
		System.out.println("Sau khi sap xep tang theo id: ");
		Collections.sort(list);
		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i).toString());

	}

}
