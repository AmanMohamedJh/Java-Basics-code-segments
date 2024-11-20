package arrayListss;
import java.util.*;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		
		PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
		pq.poll();
		pq.poll();
		pq.poll();
		pq.poll();
		pq.poll();
		pq.peek();
		pq.add(50);
		pq.peek();
		pq.poll();
		
		if(pq.peek() == null) {
			System.out.println("there is no number");
		}
		else {
			System.out.println("There is a number below");
		}
		
		for (Integer integer : pq) {
			System.out.println(integer);
		}
	}

}
