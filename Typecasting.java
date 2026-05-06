import java.util.*;
public class Typecasting {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    /* Widening implicit */
    System.out.println("Enter a number:\t");
    byte a = sc.nextByte();
    System.out.println("Byte:\t"+a);
    short b = (short)a;
    System.out.println("short:\t"+b);
    char c = (char)b;
    System.out.println("char:\t"+c);
    int d = (int)c;
    System.out.println("int:\t"+d);
    long e = (long)d;
    System.out.println("long:\t"+e);
    float f = (float)e;
    System.out.println("float:\t"+f);
    double g = (double)f;
    System.out.println("double:\t"+g);
    /* boolean h = (boolean)g; */
    sc.close();
  }
}

/* byte - short- char- int - long - float - double - boolean */
