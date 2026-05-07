// 1	2	3	4
// 5	6	7
// 8	9
// 10

package pract;

public class NumberSeriesPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 5;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + " ");
				while(j == 4) {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
