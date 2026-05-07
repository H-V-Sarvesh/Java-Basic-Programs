public class Summation2_1 {
  public static int add(int n) {
    //base case
    if(n == 0){
      return 0;
    }
    return n + add(n - 1); // void methods cannot return a value
  }

  public static void main(String[] args) {
    int res = add(10);
    System.out.println(res);
  }
}
