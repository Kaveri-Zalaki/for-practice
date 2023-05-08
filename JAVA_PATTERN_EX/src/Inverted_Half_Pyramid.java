import java.util.Scanner;

/**
 * 
 */

/**
 * @author kaveri.zalaki
 *
 */
public class Inverted_Half_Pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int row;
		System.out.println("enter no of rows");
		row=sc.nextInt();
		
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
