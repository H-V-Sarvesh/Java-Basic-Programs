package pract;

class A {

	public static void m1(String[] args) {
		// TODO Auto-generated method stub

	}

}

class B extends A {

	public static void m2() {
		System.out.println("Class B");

	}

}

class C extends B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// B bobj = new B();
		//A bobj = new B();
		A aobj = new C();
	}
}
