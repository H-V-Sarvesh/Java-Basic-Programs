package pract;

import java.util.*;

class Bikes {
	static Scanner sc = new Scanner(System.in);
	static String Vehicle = "Bike";
	static int minspeed = 100;
	static int wheels = 2;
	static String Wheeltype = "Cast Iron";
}

class Triumph extends Bikes {

	public static void Triumph1() {
		
		System.out.println("The vehicle is:\t"+Vehicle);
		System.out.println("The Min Speed of Triumph bike is:\t" + minspeed);
		System.out.println("The wheels of Triumph bike is:\t" + wheels);
		System.out.println("The wheel type is:\t"+Wheeltype);
	}
}

class Suzuki extends Triumph {
	public static void Suzuki1() {

		System.out.println("The vehicle is:\t"+Vehicle);
		System.out.println("The Min Speed of Suzuki bike is:\t" + minspeed);
		System.out.println("The wheels of Suzuki bike is:\t" + wheels);
		System.out.println("The wheel type is:\t"+Wheeltype);
	}
}

class Jawa extends Suzuki {
	public static void Jawa1() {

		System.out.println("The vehicle is:\t"+Vehicle);
		System.out.println("The Min Speed of Suzuki bike is:\t" + minspeed);
		System.out.println("The wheels of Suzuki bike is:\t" + wheels);
		System.out.println("The wheel type is:\t"+Wheeltype);
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a Bike brand with CamelCasing:\t");
		String s = sc.nextLine();

		if (s.equals("Triumph")) {
			Triumph1();
		} else if (s.equals("Suzuki")) {
			Suzuki1();
		} else if (s.equals("Jawa")) {
			Jawa1();
		} else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}