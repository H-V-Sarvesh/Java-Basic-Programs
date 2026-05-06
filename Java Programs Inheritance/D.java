class A {
	int i;
	public A(){
	System.out.println("Inside A");
	}
	public static void m1() {
		 
	}

}

class B extends A{
	public B(){
	System.out.println("Inside B");
	}
	
}

class C extends B{
	public C(){
	System.out.println("Inside C");
	}
}


class D extends C{
	public D(){
	System.out.println("Inside D");
	}
	public static void main(String[] args) {
		C Cobj = new C(); //instantiated
	}

}



