package com.shobhan956.learn;

public class LaunchInherot2 {
	public static void main(String[] args) {
		C c=new C();
	}
}

class A{
	 int a=9;
}
class B extends A{
	int b=10;
	B() {
		System.out.println(a);
	}
}
class C extends B{
	C() {
		System.out.println(b);
	}
}