import java.util.Scanner;

public class Inverted_half_pyramid_right {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			// inner loop to print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print *
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
