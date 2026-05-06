package pract;

public class Vehicle {

	public int wheels;
	public String color;
	public String brand;
	
	public Vehicle() {
		System.out.println("Vehicle Constructor is called");
		wheels = 4;
		color = "black";
		brand = "BMW";
	}	
}

class Car extends Vehicle{
	
	public Car() { //constructor
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car vOBJ = new Car();
		System.out.println(vOBJ.color);
		System.out.println(vOBJ.brand);
		System.out.println(vOBJ.wheels);
	}
}

