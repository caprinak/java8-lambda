package io.javabrains;

public class Greeter {
	//passing a behavior to a method
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	//function as value
	public static void main(String[] args) {
		Greeter grt = new Greeter();
		HelloworldGreeting hlgr = new HelloworldGreeting();
		grt.greet(hlgr);
		
		
		Greeting mylamdaFunction = () -> System.out.println("hello world in lamda");
		mylamdaFunction.perform();
		
		MyAdd addFunction = (int a, int b) -> a + b;
		int b = addFunction.add(1, 3);
		System.out.println(b);
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("howdy");
			}
		};
		innerClassGreeting.perform();
	}
}

interface MyLambda {
	void foo();
}

interface MyAdd{
	int add(int x, int y);
}