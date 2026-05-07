abstract class KFC {
  abstract void biriyani();
}

class SecondFloor extends KFC {
  @Override
  void biriyani() {
    System.out.println("Our biriyani is the Best & Price is Rs:- 350");
  }
}

public class Restaurant {
  public static void main(String[] args) {
    System.out.println("Welcome to restaurant!");

    SecondFloor sf = new SecondFloor();
    sf.biriyani();

    System.out.println("----------------------------------------");

    KFC k = new SecondFloor(); // polymorphism
    k.biriyani();
  }
}