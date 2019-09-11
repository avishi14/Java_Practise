
public class Greet {

	int x=10;
	static int y=10;
	public Greet(){
		x++;
		System.out.println("value of non static variable is "+ (x));
		y++;
		System.out.println("value of static member is " + (y++));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet g1 = new Greet();
		Greet g2 = new Greet();
		Greet g3 = new Greet();
		Greet g4 = new Greet();
	}

}
