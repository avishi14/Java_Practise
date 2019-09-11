
public class X implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X run = new X(); Thread t = new Thread(run); t.start();     
		    } 
		    public void run() {
		    	System.out.println("hi");
		    } 
		
	}


