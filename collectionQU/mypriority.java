package collectionQU;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class mypriority {

	public static void main(String[] args) {
		PriorityQueue<String> books = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the book's title : ");
			String title = sc.next();

			if (title.equalsIgnoreCase("DONE")) {
				break;
			}

			books.add(title);

		}
		System.out.println("Enter the book's title to remove : ");
		String titleRemove = sc.next();

		boolean result = books.remove(titleRemove);

		if (result) {
			System.out.println("Book title is removed from list");
			System.out.println("Book title '" + titleRemove + "' has been removed from the list.");
		} else {
			System.out.println("No book title has found");
		}
		int totalbooks = books.size();
		System.out.println("Total number of books : " + totalbooks);

		for (String available : books) {
			System.out.println("The book available : " + available);
		}
	}

}
