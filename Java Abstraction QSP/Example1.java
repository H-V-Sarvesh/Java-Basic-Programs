interface Vehicle {
  void stop();
}

class Car implements Vehicle{
  @Override
  public void stop(){
    System.out.println("Car has stopped");
  }
}

class Example1{
  public static void main(String[] args) {
    Car c = new Car();
    c.stop();

    Vehicle v = new Car();
    v.stop();
  }
}
