package arrayss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class arrays {

	public static void main(String[] args) {
		
		Queue<Integer> PriorityQueue = new PriorityQueue<Integer>();
		PriorityQueue.add(10);
		PriorityQueue.add(40);
		PriorityQueue.add(20);
		PriorityQueue.add(556);
		PriorityQueue.add(102);
		PriorityQueue.add(18);

   for (Integer value : PriorityQueue) {
	   
	System.out.println(value);
}
	}

}
