import java.util.*;

class User {
  String userName;
  long phNo;
  int userId;

  User(String userName, long phNo, int userId) {
    this.userName = userName;
    this.phNo = phNo;
    this.userId = userId;
  }

  void userDetails() {
    System.out.println("\t\tUser details");
    System.out.println("user name is : " + userName);
    System.out.println("user phone number is : " + phNo);
    System.out.println("user id is : " + userId);
  }
}

class Product {
  String productName;
  double productPrice;

  Product(String productName, double productPrice) {
    this.productName = productName;
    this.productPrice = productPrice;
  }

  void productDetails() {
    System.out.println("\t\tProduct details");
    System.out.println("product name is:\t" + productName);
    System.out.println("product price is:\t" + productPrice);
  }
}

interface Payment {
  String pay(double amount);
}

class UPI implements Payment {
  @Override
  public String pay(double amount) {
    return "payment done by UPI "+ amount + " rs";
  }
}

class Card implements Payment {
  @Override
  public String pay(double amount) {
    return "payment done by Card "+ amount + " rs";
  }
}

class Cash implements Payment {
  @Override
  public String pay(double amount) {
    return "payment done by cash "+ amount + " rs";
  }
}

class EcomApp {
  static Scanner sc = new Scanner(System.in);
  // static Payment payment;
  public static void main(String[] args) {
    System.out.println("Hello World!");
    User user1 = new User("John", 1234567890, 101);
    user1.userDetails();

    Product p1 = new Product("Laptop", 72000);
    p1.productDetails();

    System.out.println("enter your payment method:\t");
    String PaymentMethod = sc.next();
    
    Payment payment = null;

    if(PaymentMethod.toLowerCase().equals("upi")){
      payment = new UPI();
    }
    else if(PaymentMethod.toLowerCase().equals("card")){
      payment = new Card();
    }
    else if(PaymentMethod.toLowerCase().equals("cash")){
      payment = new Cash();
    }
    else{
      System.out.println("Wrong Payment");
    }
    System.out.println(payment.pay(p1.productPrice));
  }
}