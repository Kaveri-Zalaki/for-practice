package Arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int numbers[] = new int[size];

		//input elements
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		//input search element
		System.out.println("enter the search element");
		int x = sc.nextInt();

		// output
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == x) {
				System.out.println("x found at index: " + i);
			} 
		}
		System.out.println("Element does not found");
	}

}
