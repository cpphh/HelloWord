package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SapXepNguoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Nguoi> list = new ArrayList<Nguoi>();
		list.add(new Nguoi(3,"cuong",21));
		list.add(new Nguoi(3,"cuong",20));
		list.add(new Nguoi(3,"duy",19));
		list.add(new Nguoi(2,"nam",19));
		list.add(new Nguoi(4,"cuong",19));
		list.add(new Nguoi(7,"tung",19));
		list.add(new Nguoi(3,"cuong",19));
		list.add(new Nguoi(6,"duy",19));
		list.add(new Nguoi(9,"tuan",19));
		
		for(Nguoi n : list)
			System.out.println(n.toString());
		
		Collections.sort(list, new Comparator<Nguoi>() {

			@Override
			public int compare(Nguoi o1, Nguoi o2) {
				if(o1.getId() > o2.getId())
					return 1;
				else if(o1.getId() < o2.getId())
					return -1;
				else return 0;
			}
		});

		System.out.println("Sau khi sap xep tang theo id: ");
		for(Nguoi n : list)
			System.out.println(n.toString());
		
		list.sort((p1, p2) -> {
			if(p1.getId() > p2.getId())
				return 1;
			else if(p1.getId() < p2.getId())
				return -1;
			if(p1.getTen().compareTo(p2.getTen()) > 0)
				return 1;
			else if(p1.getTen().compareTo(p2.getTen()) < 0)
				return -1;
			else if(p1.getTuoi() - p2.getTuoi() > 0)
				return 1;
			else if(p1.getTuoi() - p2.getTuoi() < 0)
				return -1;
			else return 0;
		});
		
		System.out.println("Sau khi sap xep tang theo nhieu tieu chi: ");
		for(Nguoi n : list)
			System.out.println(n.toString());

	}

}
