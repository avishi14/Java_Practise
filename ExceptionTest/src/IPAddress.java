import java.util.Scanner;



public class IPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your IP address: ");
		String s = sc.next();
		
		try {
			
		validate(s);
		}catch(Exception e) {
			System.out.println("Exception occured "+e);
		}
		System.out.println("Welcome to custom Exception");
	}

	private static void validate(String s) throws Exception {
		// TODO Auto-generated method stub
		if(s.equals("192.168.2.2")) {
			System.out.println("valid");
		}
		else {
			throw new Exception("Invalid");
		}
	}

}
