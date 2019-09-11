
public class Aeroplane implements FlyingVehicle, Flyingobject {
	public void fly() {
		
		// TODO Auto-generated method stub
		System.out.println("Aeroplane: fly");
	}

	public void wings() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane: 2 wings");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Aeroplane a = new Aeroplane();
		a.fly();
		a.wings();
	}
}
