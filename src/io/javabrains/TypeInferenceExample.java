package io.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Infer the type of s
		StringLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("hello lambda"));
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Anh khong biet"));
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}

}
