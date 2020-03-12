package io.javabrains.unit3;

public class MethodReferenceExample {

	public static void main(String[] args) {
		printMessage();
		//thread will implement runnable interface
		Thread t = new Thread(() -> printMessage());
		t.start();
		
		Thread t1 = new Thread(MethodReferenceExample::printMessage);
		t1.start();
	}
	
	public static void printMessage() {
		System.out.println("Howdy");
	}
}
