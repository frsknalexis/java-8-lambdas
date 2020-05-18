package com.dev.app.defaults;

public class Cliente14 implements Interface1, Interface4 {

	@Override
	public void methodA() {
		System.out.println("Inside Method A: " + Cliente14.class);
	}
	
	public static void main(String...strings) {
		Cliente14 cliente14 = new Cliente14();
		cliente14.methodA();
	}
}
