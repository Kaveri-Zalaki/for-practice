import java.util.Scanner;

public class Hollow_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter no of rows");
		int row = sc.nextInt();
		System.out.println("enter no of cols");
		int col = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == 1 || j == 1 || i == row || j == col) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
