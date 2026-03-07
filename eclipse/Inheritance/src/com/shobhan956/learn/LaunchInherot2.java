package com.shobhan956.learn;

public class LaunchInherot2 {
	public static void main(String[] args) {
		C c=new C();
		c.show();
	}
}

class A{
	 int a=9;
}
class B extends A{
	int b=10;
	public void show() {
		System.out.println(a);
	}
}
class C extends B{
	public void show() {
		System.out.println(b);
	}
}