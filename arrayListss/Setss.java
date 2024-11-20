package arrayListss;
import java.util.*;

public class Setss {

	public static void main(String[] args) {
		
		
		SortedSet<Integer> set1 = new TreeSet<>();
		
		set1.add(69);
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(50);
		for (Integer integer : set1) {
			System.out.println(integer);
		}

	}

}
