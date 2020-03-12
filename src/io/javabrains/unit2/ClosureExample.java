package io.javabrains.unit2;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		//closure is expected to be final
		int b = 20;
		doProcess(a, i -> System.out.println(i + b));
				
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}
interface Process{
	void process(int i);
}