package star_programs;

import java.util.Scanner;

public class NumDiamondPattern {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of star:\t");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
