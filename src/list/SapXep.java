package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapXep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");
		
		for(String string : list)
			System.out.println(string);
		
		System.out.println("Sau khi sap xep");
		Collections.sort(list);
		for(String string : list)
			System.out.println(string);

	}

}
