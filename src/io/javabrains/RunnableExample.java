package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
			
		});
		//lambda provides implement for the only method in functional interface
		Thread myLambdaThread = new Thread(() -> System.out.println("In my lambda thread"));
				
		myLambdaThread.run();
		myThread.run();
	}

}
