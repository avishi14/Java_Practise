package java_file;

import java.util.function.Function;

public class FunctionalLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Function<String,Integer> len= (str)-> str.length();
	String str= "Hello";

	System.out.println("Length of the string: " + len.apply(str));
	
	
	
	
	}

}
