import java.util.Scanner;

class ExceptionExample extends Exception{
	ExceptionExample(String s) {

		super(s);
	}
}

public class AgeException{
	static void validate(int age) throws ExceptionExample{
		if(age<18)
			throw new ExceptionExample("Not Valid");
		else
			System.out.println("you can vote");
	}
	
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			validate(age);
		}catch(Exception e) {
			System.out.println("Exception occured "+e);
		}
		System.out.println("Welcome to custom Exception");
	}
}