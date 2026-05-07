package programs;

public class Main {
    public static void main(String[] args) {
        int a = 8, b = 24, c = 0 ;
        
        c = a + b + a++ + b++ + ++a + ++b ;
        System.out.println(c) ;
    }
}
