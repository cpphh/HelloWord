package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Giu thu tu nhap vao va co the trung nhau, vao truoc thi ra truoc
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("C");
		queue.add("B");
		queue.add("A");
		queue.add("E");
		queue.add("D");
		queue.add("A");
		
		for(String s : queue)
			System.out.println(s);
		
		System.out.println("\n");
		queue.remove();
		for(String s : queue)
			System.out.println(s);
		
		System.out.println("\n");
		queue.remove("A");
		for(String s : queue)
			System.out.println(s);

	}

}
