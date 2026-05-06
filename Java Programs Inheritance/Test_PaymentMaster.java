// Also known as property of runtime polymorphism.
// reusable
// Overriding same method to the sub classes from (super/parent) class
// sub classes -> Gpay, UPI, Netbanking.
// overrides the method's functionality of the super/parent class.

import java.util.*;

class PaymentMaster{
    int payment;
    int amount;
    int gst;
    void pay(){
    payment = 0;
    amount = 0;
    gst = 0;
    }
}

class Gpay extends PaymentMaster{
    static Scanner sc = new Scanner(System.in);
    void pay(){
        System.out.println("Welcome to Gpay.");
        System.out.println("Enter the amount.");
        amount = sc.nextInt();
        gst = 20;
        payment = amount * gst;
        System.out.println("Your total payment is:\t" + payment);
    }
}

class UPI extends PaymentMaster{
    static Scanner sc = new Scanner(System.in);
    void pay(){
        System.out.println("Welcome to UPI.");
        System.out.println("Enter the amount.");
        amount = sc.nextInt();
        gst = 40;
        payment = amount * gst;
        System.out.println("Your total payment is:\t" + payment);
    }
}

class Netbanking extends PaymentMaster{
    static Scanner sc = new Scanner(System.in);
    void pay(){
        System.out.println("Welcome to Netbanking.");
        System.out.println("Enter the amount.");
        amount = sc.nextInt();
        gst = 60;
        payment = amount * gst;
        System.out.println("Your total payment is:\t" + payment);
    }
}


class Test_PaymentMaster{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        PaymentMaster payOBJ;
        System.out.println("Enter the preffred payment method:\t");
        String s = sc.nextLine();
        if( s.equals("Gpay") ){
            payOBJ = new Gpay();
            payOBJ.pay();
        }
        else if( s.equals("Netbanking") ){
            payOBJ = new Netbanking();
            payOBJ.pay();
        }
        else if(s.equals("UPI")){
            payOBJ = new UPI();
            payOBJ.pay();
        }
        sc.close();
    }
}



