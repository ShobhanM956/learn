package com.shobhan956.polymorphism;

public class LaunchPoly2 {
	public static void main(String[] args) {
		
		CommercialPlane cp = new CommercialPlane();
		FighterPlane fp = new FighterPlane();
//		cp.takeOff();
//		cp.fly();
//		fp.takeOff();
//		fp.fly();

		Plane p = new Plane();
		p.call(cp);
		p.call(fp);
	}
}

class Plane{
	public void call(AeroPlane ar) {
		ar.takeOff();
		ar.fly();
	}
}

class AeroPlane{
	public void takeOff() {
		System.out.println("Aeroplane taking off");
	}
	public void fly() {
		System.out.println("Aeroplane if flying");
	}
}
class CommercialPlane extends AeroPlane{
	public void takeOff() {
		System.out.println("CommPlane taking off");
	}
	public void fly() {
		System.out.println("comm plane if flying");
	}
}
class FighterPlane extends AeroPlane{
	public void takeOff() {
		System.out.println("fighterplane if taking off");
	}
	public void fly() {
		System.out.println("fighter plane if flying");
	}
}