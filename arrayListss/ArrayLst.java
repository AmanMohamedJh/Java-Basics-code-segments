package arrayListss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayLst {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("The initial size of array list : "+numbers.size());
		

		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		Integer nums[] = new Integer[numbers.size()]; //toArray
		nums = numbers.toArray(nums);
		
		int sum=0;
		
		for (int i = 0; i < nums.length; i++) {
		    sum += nums[i];
		}

		System.out.println("The sum : "+sum);
		
		System.out.println("The initial size of array list : "+numbers.size());
	}

}
