package com.shobhan956.abstraction;

public class LaunchInterface {
	
	public static void main(String[] args) {
		
		//implementing using annonymous inner class
		Myinter in = new Myinter() {
			
			@Override
			public void mainInterface() {
				System.out.println("interface implementation in main");
				
			}
		};
		in.mainInterface();
		LaunchInterface b=new LaunchInterface();
		b.mainInterface();
		B2 b2=new B2();
		b2.mainInterface();
	}

	public void mainInterface() {
		System.out.println("My interface");
	}
}

interface Myinter{
	public void mainInterface();
}

class B2 implements Myinter{
	@Override
	public void mainInterface() {
		System.out.println("Inside B class implementation");
	}

	
}
