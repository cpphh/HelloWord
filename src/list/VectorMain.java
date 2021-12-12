package list;

import java.util.List;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> vector = new Vector<>();
		Person p1, p2, p3;
		p1 = new Person(1, "cuong");
		p2 = new Person(2, "duy");
		p3 = new Person(3, "tuan");
		
		vector.add(p1);
		vector.add(p2);
		vector.add(p3);
		vector.add(new Person(4, "tung"));
		
		for(Person l:vector)
			System.out.println(l.toString());
		
		vector.remove(p2);
		System.out.println("\n");
		
		for(int i =0; i<vector.size(); i++)
			System.out.println(vector.get(i).toString());
		
		Person p = vector.get(2);
		System.out.println("\n"+p.toString());
	}

}
