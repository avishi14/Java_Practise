
public class Dog extends Animal {

	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dogs Bark.");
	}

	public void eat(){
		System.out.println("Dogs eat biscuits.");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.sound();
		
		Cat cat =  new Cat();
		cat.sound();
	}
}
