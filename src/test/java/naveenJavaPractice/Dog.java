package naveenJavaPractice;

public class Dog implements AnimalInterface{
static int x=0;
	public static void main(String[] args) {
		Dog dogObj = new Dog();
		dogObj.AnimalAge();
		dogObj.AnimalSound();
        dogObj.AnimalLocation();
        System.out.println(x);
	}

	//@Override
	public void AnimalSound() {
		System.out.println("Animal Sound is  Bho Bho");
		
	}

	//@Override
	public void AnimalAge() {
		System.out.println("Animal age is ");
		
	}

	@Override
	public void AnimalLocation() {
		System.out.println("Location of Animal is Delhi Zoo");
		
	}
	
	public  Dog() {
		
		  x = 10;
	}

}
