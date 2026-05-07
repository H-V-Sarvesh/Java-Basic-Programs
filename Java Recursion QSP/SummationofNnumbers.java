/* package 05-05-26 Recursion; */

public class SummationofNnumbers {
  public static void summation(int n) {
    int formula = n * (n + 1) / 2;
    // summation(formula);
    System.out.println("Result is:\t" + formula);
  }

  public static void main(String[] args) {
    System.out.println("Summation of N numbers");
    summation(100);
  }
}
