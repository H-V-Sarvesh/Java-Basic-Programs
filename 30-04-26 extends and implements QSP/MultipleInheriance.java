// package 30-04-26 extends and implements;

interface Father {
  public void responsibility();
}

interface Grandfather {
  public void storyTelling();
}

class Mother {
  void care() {
    System.out.println("Taking care of Family.");
  }
}

class Child extends Mother implements Father, Grandfather {
  @Override // Metheodoverriding.
  public void responsibility() {
    System.out.println("eat sleep repeat");
  }

  @Override // Metheodoverriding.
  public void storyTelling() {
    System.out.println("knows MARVEL Story.");
  }
}

class MultipleInheriance {
  public static void main(String[] args) {
    System.out.println("Welcome to Family.");
    Mother m1 = new Mother();
    m1.care();
    System.out.println("=================================================");
    Child c = new Child();
    c.responsibility();
    c.storyTelling();
    c.care();
  }
}

/* Interface does not have 'constructor'. So, there is no confusion. */
/* whereas, class has 'constructor' and class makes confusion */
/*
 * By usual, methods inside interface are 'abstract' in nature.
 */
/*
 * abstract method cannot be stored inside concrete class.
 */
/* There is NO constructor inside 'interface' */
/* Interface refference and class object is possible using interface */
/* i.e., Upcasting is possible in Interface. */

// recurrsion
// MultiDimension Array