/* package 05-05-26 Recursion; */

public class Print10 {
  public static void print10(int n) {
    System.out.println();
    if (n == 11 || n >10) {
      return;
    }
    System.out.println(n);
    print10(n+1);
  }

  public static void main(String[] args) {
    System.out.println("Start");
    print10(1);
    System.out.println("End");
  }
}
