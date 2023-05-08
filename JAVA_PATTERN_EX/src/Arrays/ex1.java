package Arrays;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

//		int marks[]= new int[3];
//		marks[0]=92; //Physics
//		marks[1]=93; //chemistry
//		marks[2]=98; //maths

//		int marks[] = { 97, 98, 99 };
//		for (int i = 0; i < 3; i++) {
//			System.out.println(marks[i]);
//		}

		System.out.println("enter the size");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		
		//Input
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int x= sc.nextInt(); 
		
		//Output
		for (int i = 0; i < size; i++) {
		
			if(i==x) {
				System.out.println("the number exists");
//			System.out.println(numbers[i]);
		}}
	}

}
