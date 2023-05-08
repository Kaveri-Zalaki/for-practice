package Arrays;

import java.util.Scanner;

public class Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows = sc.nextInt();
		System.out.println("enter no of cols");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];

		//input
		System.out.print("enter the inputs");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//output
		System.out.println("print the output");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
