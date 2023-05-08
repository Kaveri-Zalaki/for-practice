import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();

		// Upper Half
		for (int i = 1; i <= n; i++) {
			//left part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			//right part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println(" ");
		}

		// lower half
		for (int i = n; i >= 1; i--) {
			//left part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			//right part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
	}
}
