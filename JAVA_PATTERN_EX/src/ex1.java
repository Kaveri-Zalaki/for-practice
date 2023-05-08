import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row, col;
		System.out.println("Enter no of rows");
		row=sc.nextInt();
		
		System.out.println("enter no of cols");
		col=sc.nextInt();
		
		for( int i=1; i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
