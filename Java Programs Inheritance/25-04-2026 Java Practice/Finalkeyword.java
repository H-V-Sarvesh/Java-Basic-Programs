
public class Finalkeyword {

  // static variable
  static final int x;

  // static initializer
  static {
    x = 100;
  }

  // instance variable
  final int y;

  // constructor
  Finalkeyword() {
    y = 10;
  }

  public static void main(String[] args) {
    System.out.println(x);

    Finalkeyword obj = new Finalkeyword();
    System.out.println(obj.y);
  }
}


/*
public class Finalkeyword {
  
// static initializer
static final int x;  
static{
  x = 10;
}
System.out.println(x);

// Non static Initializer
final int y;
Finalkeyword(){
  y = 10;
}
System.out.println(y);

public static void main(String[] args) {
}
}
*/