package pract;

import java.util.*;

public class Tcs_OddNumber_Condition {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to get number of inputs:\t");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Invalid input");
			return;
		}

		int arr[] = new int[n];
		int result = 0;
		int count = 0;

		System.out.print("Enter the number " + n + " of series:\t");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result += arr[i];
				count++;
			}
		}

		if (count == 0) {
			System.out.println("No odd numbers found");
			return;
		}

		float average = result / count;

		System.out.println("Sum of every odd numbers:\t" + result + " ");
		System.out.println("Count of every odd numbers:\t" + count + " ");
		System.out.println("Average of total odd numbers:\t" + average);

	}
}

