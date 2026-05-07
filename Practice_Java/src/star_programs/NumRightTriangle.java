package star_programs;

// Same Number are repeated throughout the row.

import java.util.Scanner;

public class NumRightTriangle {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a Number of Stars at max:\t");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) { // Loop to Iterate number of times
			for (int j = 1; j <= i; j++) { // Loop to traverse the Numbers 
										   //along the row's increment
				System.out.print(i+" ");
			}
			System.out.println(); // to shift to next line(row).
		}
		sc.close();
	}
}
