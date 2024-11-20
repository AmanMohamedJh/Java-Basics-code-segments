package collectionQU;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {

		Map<Integer,Integer> products = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the product ID : ");
			int pid =sc.nextInt();
			
			if(pid==-99) {
				break;
			}
			
			System.out.println("Enter the product Quantity : ");
			int qty =sc.nextInt();
			
			products.put(pid, qty);
		}
		System.out.println("Enter the product ID to remove: ");
		int Rpid =sc.nextInt();
		
		boolean result = products.containsKey(Rpid);
		
		if(result) {
			products.remove(Rpid);
			System.out.println("Succesfully removed product");
		}
		else {
			System.out.println("Product was not found");
		}
		
		int totalProducts = products.size();
		System.out.println("Total number of products in hashmap : "+totalProducts);
		
		System.out.println("=========Product details============");
		for (Integer i : products.keySet()) {
			System.out.println("Product ID : " + i +" => Quantity : "+products.get(i));
		}
		
	}

}
