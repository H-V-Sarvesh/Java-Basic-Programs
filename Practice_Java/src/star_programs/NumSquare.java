package star_programs;

// To print Same number throughout the row
// In a Square shaped format.

import java.util.Scanner;

public class NumSquare {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of Stars at MAX:\t");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) { //Loop to iterate times the number of rows 
			for (int j = 0; j <= n; j++) { //Loop to traverse the series for each row
				System.out.print(i + " ");
			}
			System.out.println(); // to shift to next line(row).
		}
		sc.close();
	}
}
