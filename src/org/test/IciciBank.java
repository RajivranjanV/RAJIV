package org.test;

public class IciciBank extends RBIBank {

	@Override
	public void saving() {
		System.out.println("8%");
		
	}

	@Override
	public void deposit() {
		System.out.println("6%");
		
	}
	public static void main(String[] args) {
		IciciBank b=new IciciBank();
		b.saving();
		b.deposit();
		b.fixed();
		
		
	}

}
