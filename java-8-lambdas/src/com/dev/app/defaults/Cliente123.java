package com.dev.app.defaults;

public class Cliente123 implements Interface1, Interface2, Interface3 {
	
	@Override
	public void methodA() {
		System.out.println("Inside Method A: " + Cliente123.class);
	}

	public static void main(String...strings) {
		Cliente123 cliente123 = new Cliente123();
		cliente123.methodA();
		cliente123.methodB();
		cliente123.methodC();
	}
}