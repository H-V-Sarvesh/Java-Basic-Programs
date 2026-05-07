public class Summation2 {
  public static void add(int i, int n, int sum) {
    if (i > n) {
      System.out.println(sum);
      return;
    }
    // sum = sum * i;
    sum = sum + i;
    add(i + 1, n, sum);
  }

  public static void main(String[] args) {
    add(1, 10, 0);
  }
}
