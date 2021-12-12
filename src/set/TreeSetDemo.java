package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khong co phan tu trung lap va sap xep theo thu tu tang dan

		Set<String> set = new TreeSet<String>();
		
		set.add("C");
		set.add("A");
		set.add("B");
		set.add("A");
		set.add("D");
		
		for(String s : set)
			System.out.println(s);
	}

}
