import java.util.Scanner;

public class Half_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int row, col;
		System.out.println("Enter no of rows");
		row = sc.nextInt();
		
		for( int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
