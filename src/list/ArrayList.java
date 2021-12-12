package list;

import java.util.List;
public class ArrayList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list = new java.util.ArrayList<Person>();
		Person p1, p2, p3;
		p1 = new Person(1, "cuong");
		p2 = new Person(2, "duy");
		p3 = new Person(3, "tuan");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(new Person(4, "tung"));
		
		for(Person l:list)
			System.out.println(l.toString());
		
		list.remove(p2);
		System.out.println("\n");
		
		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i).toString());
		
		Person p = list.get(2);
		System.out.println("\n"+p.toString());
		
		list.set(0, new Person(10,"Sua"));
		System.out.println("\n");
		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i).toString());
		
		list.clear();//Xoa toan bo danh sach
		System.out.println(list.size());
	}
}

