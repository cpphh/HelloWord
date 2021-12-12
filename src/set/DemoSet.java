package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tu sap xep cac phan tu va khong co phan tu trung nhau
		Set<String> setString = new HashSet<String>();
		
		setString.add("B");
		setString.add("A");
		setString.add("B");
		setString.add("D");
		setString.add("C");
		setString.add("E");
		
		for(String s : setString)
			System.out.println(s);
		
		System.out.println("\n");
		Iterator<String> irt = setString.iterator();
		while(irt.hasNext()) {
			System.out.println(irt.next());
		}

	}

}
