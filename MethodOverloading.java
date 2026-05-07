public class MethodOverloading {
  static float result;
  public static void add(int a, int b, int c) {
    result = a + b + c;
    System.out.println("Sum of three numbers is:\t" + result);
  }

public static void multiply(int a, int b, float c){
  result = a*b*c;
  System.out.println("Product ofthree numbers is:\t "+result);
}

public static double subtract(double a, float b, int c){
  result = a - b - c;
  System.out.println("Subrihend of three numbers:\t");
  return 12.0f;
}

  public static void main(String[] args) {

  }
}


// byte-short-char-int-long-float-double-boolean