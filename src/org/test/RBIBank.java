package org.test;

public abstract class RBIBank {
	//abstract method
	public abstract void saving();
	public abstract void deposit();
// non abstract method
	public void fixed() {
		System.out.println("10%");

	}
}
