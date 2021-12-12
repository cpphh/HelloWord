package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Co the xoa trong vong lap của Interator
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		/*for(int i =0; i<list.size(); i++) {
			if(list.get(i).equals("A"))
				list.remove(i);
		}*/
		
		Iterator<String> irt = list.iterator();
		while(irt.hasNext()) {
			String s = irt.next();
			if(s.equals("A"))
				irt.remove();
		}
		
		for(String s : list)
			System.out.println(s);

	}

}
