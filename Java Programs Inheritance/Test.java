import java.util.*;

class Bikes{
	static String Vehicle = "Bike";
	static int minspeed = 100;
	static int wheels = 2;
	static String Wheeltype = "Cast Iron";	
}

class Triumph extends Bikes{ // inheriting, extending, 
	
	public static void triumph1() {
		
		System.out.println("The vehicle is:\t"+Vehicle);
		System.out.println("The Min Speed of Triumph bike is:\t" + minspeed);
		System.out.println("The wheels of Triumph bike is:\t" + wheels);
		System.out.println("The wheel type is:\t"+Wheeltype);
	}
}

class Suzuki extends Triumph {
	
	public static void suzuki1() {
		
		System.out.println("The vehicle is:\t"+Vehicle);
		System.out.println("The Min Speed of Suzuki bike is:\t" + minspeed);
		System.out.println("The wheels of Suzuki bike is:\t" + wheels);
		System.out.println("The wheel type is:\t"+Wheeltype);
	}
}

class Jawa extends Suzuki {
	public static void jawa1() {
		
		System.out.println("The vehicle is:\t"+Vehicle);
		System.out.println("The Min Speed of Suzuki bike is:\t" + minspeed);
		System.out.println("The wheels of Suzuki bike is:\t" + wheels);
		System.out.println("The wheel type is:\t"+Wheeltype);
		
	}
}

class Test{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Bike brand with CamelCasing:\t");
		String s = sc.nextLine();

		Triumph TOBJ1 = new Triumph();
		Suzuki SOBJ1 = new Suzuki();
		Jawa JOBJ1 = new Jawa();

		if (s.equals("Triumph")) {
			TOBJ1.triumph1();
		} else if (s.equals("Suzuki")) {
			SOBJ1.suzuki1();
		} else if (s.equals("Jawa")) {
			JOBJ1.jawa1();
		} else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}
