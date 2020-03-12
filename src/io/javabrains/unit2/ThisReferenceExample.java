package io.javabrains.unit2;

public class ThisReferenceExample {
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		// this points to thisref
		doProcess(10, i -> {
			System.out.println("value of i is " + i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisReferenceExample thisref = new ThisReferenceExample();
		
		thisref.doProcess(10, i -> {
			System.out.println("value of i is " + i);
			//System.out.println(this); This will not work
		});
		
		thisref.execute();
	}
	
	public String toString() {
		return "this in a class instance";
	}
}
