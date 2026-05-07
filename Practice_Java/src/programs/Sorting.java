package programs;

import java.util.Arrays;

public class Sorting {
	// static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	int arr[] = {15,9,4,6,3,1,2,11,10,13,14,12,5,7,8};
		for(int i=0; i < arr.length; i++) {
			Arrays.sort(arr);
		}
		
		System.out.println("Numbers sorted in Ascending Order: ");
		System.out.println(Arrays.toString(arr));
		//System.out.println(arr);
	}
}