package Arrays;

import java.util.Scanner;

public class SearchElement2D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter no of rows");
		int rows = sc.nextInt();
		System.out.println("enter no of cols");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];

		System.out.println("enter the elements of matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("enter the search element");
		int x = sc.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] == x) {
					System.out.println("element found at row index:" + i + " and at col index" + j);
				}
			}

		}

	}

}
