package star_programs;

// Java Program to Print Number of Series
// row by row in a series, forming Right Triangle.

import java.util.Scanner;

public class NumRightTraingleSeries {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a max number of Star:\t");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) { //Loop to iterate number of times == number of rows
			for (int j = 1; j <= i; j++) { // Loop to traverse the number series for each row.
				System.out.print(j+" ");
			}
			System.out.println(); // to shift to next line(row).
		}
	}

}
