package com.shobhan956.polymorphism;

public class LaunchPoly {
	public static void main(String[] args) {
		Animal c=new Cat();
//		Cat c2= new Cat();
//		c2.sound();
		c.sound();
	}
}
class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat Meow");
	}
}