package com.shobhan956.polymorphism.loosecoupling;

import com.shobhan956.polymorphism.loosecoupling.service.DisplayService;
import com.shobhan956.polymorphism.loosecoupling.service.EmailService;
import com.shobhan956.polymorphism.loosecoupling.service.IService;
import com.shobhan956.polymorphism.loosecoupling.service.MessageService;

public class LaunchMain {

	public static void main(String[] args) {
//		EmailService es = new EmailService();
//		MessageService ms = new MessageService();
//		DisplayService ds = new DisplayService();
		
		Iserviceimpl impl = new Iserviceimpl(new MessageService());
		impl.setIService(new EmailService());
		//impl.setIService(ms);
		
	}
	
}

class Iserviceimpl{
	private IService IService;

	public void setIService(IService iService) {
		this.IService = iService;
		IService.service();
	}
	
	public Iserviceimpl(IService is) {
		// TODO Auto-generated constructor stub
		this.IService = is;
		IService.service();
	}
	
}
