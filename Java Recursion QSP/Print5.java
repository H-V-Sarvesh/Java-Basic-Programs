//Recursive problem

public class Print5 {
  public static void display(int n) {
    /* Base case- to when you should stop */
    if(n == -10){
      return;
    }
    System.out.println(n);
    /* return */;
    display(n - 1);  //! recursive call
  }

  public static void main(String[] args) {
    // Base Case
    System.out.println("Start");
    display(5);
    System.out.println("End");
  }
}
