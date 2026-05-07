package star_programs;

// To print Number Series of number in a row
// row by row, repeated same.

import java.util.Scanner;

public class NumSquareSeries {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of star:\t");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
