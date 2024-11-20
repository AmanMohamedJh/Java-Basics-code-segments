package collectionQU;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class myMain2 {

	public static void main(String[] args) {
		Map<Integer,Integer> products = new HashMap<>();
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the product ID : ");
			int pid = sc.nextInt();
			
			if(pid==-99) {
				break;
			}
			
			System.out.println("Enter the product Quantity : ");
			int qty = sc.nextInt();
			
			products.put(pid, qty);
				
		}
		System.out.println("Enter the product ID to remove : ");
		int Rpid = sc.nextInt();
		
		boolean result = products.containsKey(Rpid);
		
		if(result) {
			products.remove(Rpid);
			System.out.println("removed the entered product id");
		}
		else {
			System.out.println("ID not found");
		}
		
		int totalProducts = products.size();
		
		System.out.println("Total number of products found : "+totalProducts);
		
		for (Integer i : products.keySet()) {
			System.out.println("Product id : "+i+" => Quantity : "+products.get(i));
		}
	}

}
