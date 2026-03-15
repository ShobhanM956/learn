package com.shobhan956.polymorphism;

public class MethodOverriding {
	
	public static void main(String[] args) {
//		Instrument g=new  Guitar();
//		Instrument p=new Piano();
//		//Guitar g=new Guitar();
//		g.playMusic();
//		g.shape();
//		p.playMusic();
//		p.shape();
		
		Instrument[] i = {new Guitar(), new Piano()};
		for(Instrument io: i) {
			io.playMusic();
			io.shape();
		}
		
	}

}

class Instrument{
	void playMusic() {
		System.out.println("All instrument have their own music");
	}
	void shape() {
		System.out.println("All instrument have thie own shape");
	}
}

class Guitar extends Instrument{
	void playMusic() {
		System.out.println("guitar is used for melody sound");
	}
	void shape() {
		System.out.println("guitar is very good looking");		
	}
}
class Piano extends Instrument{
	void playMusic() {
		System.out.println("Piano sounds like a queen");
	}
	void shape() {
		System.out.println("Piano looks like a keyboard of computer");
	}
}













