package com.shobhan956.abstraction;

public class LaunchActractClass {
	
	public static void main(String[] args) {
		B b=new B();
		b.add();
		System.out.println(b.add(8));
		InterfaceImpl impl = new InterfaceImpl();
		impl.mainInterface();
		C3 c3 = new C3();
		c3.callInterface();
	}

}

abstract class A{
	
	static int sum=0;
	int a, b;
	void add() {
		System.out.println(sum=a+b);
	}
	abstract int add(int a);
}
class B extends A{
	int add(int a) {
		this.a=a;
		return a;
	}
}

class InterfaceImpl implements Myinter{
	
	public void mainInterface() {
		System.out.println("My interface method");
	}
	
}

class C3{
	public void callInterface() {
		Myinter in2 = () -> System.out.println("within lambda exp");
		in2.mainInterface();
	}
}




