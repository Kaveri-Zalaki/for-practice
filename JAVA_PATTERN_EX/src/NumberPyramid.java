import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n");
		int n = sc.nextInt();
		int number = 1;

		for (int i = 1; i <= n; i++) {
			// Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			//print row number row number times
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");

			}
			number++;

			System.out.println(" ");
		}
	}

}
