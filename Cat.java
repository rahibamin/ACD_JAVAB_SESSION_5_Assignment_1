package Session5.Assignment1;

public class Cat extends Animal {

	@Override
	public void Animalsound() {
		System.out.println("Meow");
		
	} 
	public static void main(String[] args) {
		
		Animal ani = new Cat();
		ani.Animalsound();
	
	}
	

}
