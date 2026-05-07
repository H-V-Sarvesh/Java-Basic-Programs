package star_programs;

import java.util.Scanner;

public class NumRightTriangleRevSeries {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\t\t\t\tNumber Traingle Series Reversed by -1\t\t\t\t\n");
		System.out.print("Enter the number of star:\t");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
