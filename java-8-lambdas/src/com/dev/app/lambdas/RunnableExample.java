package com.dev.app.lambdas;

public class RunnableExample {

	public static void main(String...strings) {
		/**
		 * prior to java 8
		 * */
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable 1");
			}
		};
		
		new Thread(runnable).start();
		
		/**
		 *	java 8 - lambda syntax 
		 */
		Runnable runnableLambda = () -> System.out.println("Inside Runnable 2 with Lambda");
		Runnable runnableLambdaMultiStatement = () -> {
			System.out.println("Inside Runnable 3 with Lambda");
			System.out.println("Inside Runnable 4 with Lambda");
		};
		new Thread(runnableLambda).start();
		new Thread(runnableLambdaMultiStatement).start();
		new Thread(() -> System.out.println("Inside Runnable 5 with Lambda")).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable Method");
			}
		}).start();
	}
}