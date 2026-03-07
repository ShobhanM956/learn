package com.shobhan956.learn;

public class LaunchInherit {
	
	public static void main(String[] args) 
	{
		Alfa a = new Alfa(4, 5);
		a.show(3,5);
		a.show();
		a.myMethod();
	}
}

class Alfa extends Beta
{
	
	 int a=0;
	 int b=9;
	Alfa(){
		System.out.println("This is the sub-class");
	}
	Alfa(int a, int b){
		this();
		System.out.println("inside param constuctor");
	}
	public void show() {
		System.out.println("a " + a +" b " +b);
		System.out.println("Inside show method");
	}
	public void show(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("a " + a +" b " +b);
	}
	
}

class Beta
{
		Beta() {
		System.out.println("This is the super-class");
	}
		public void myMethod() {
			System.out.println("inside my menthod");
		}
}
