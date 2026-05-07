abstract interface Animal {
  abstract void run();
}

abstract interface Fish {
  abstract void swim();
}

class Bird {
  void fly() {
    System.out.println("Can FLY");
  }
}

public class SuperHero extends Bird implements Animal, Fish {
  @Override
  public void run() {
    System.out.println("can RUN");
  }

  @Override
  public void swim() {
    System.out.println("can SWIM");
  }

  public static void main(String[] args) {
    System.out.println("All classes and interfaces are implemented.");
    SuperHero s = new SuperHero();
    Bird b = new Bird();
    s.run();
    s.swim();
    b.fly();
  }
}
