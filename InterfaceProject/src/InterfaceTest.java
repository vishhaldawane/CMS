
public class InterfaceTest {
	public static void main(String[] args) {
		
		Swan swan = new Swan();
		swan.layEggs();
		swan.walk();
		swan.fly();
		swan.swim();
		
		System.out.println("-----------");
		
		Parrot parrot = new Parrot();
		parrot.fly();
		parrot.walk();
		parrot.layEggs();
		
		System.out.println("-----------");
		
		Bat bat = new Bat();
		bat.giveBirth();
		bat.fly();
		bat.walk();
		
		System.out.println("------------");
		
		Whale whale = new Whale();
		whale.swim();
		whale.giveBirth();
		
		System.out.println("====================");
		
		Swimming swimmingActivity ;
		
		swimmingActivity = swan;
		swimmingActivity.swim();
		
		Flying flyingActivity;
		
		flyingActivity = parrot;
		flyingActivity.fly();
		
	}
}

interface Flying
{
	void fly();
}

interface Swimming
{
	void swim(); //by default it is public and abstract
}
interface Walking
{
	void walk();
}
abstract class Bird
{
	abstract void layEggs();
	
}

abstract class Mammal
{
	abstract void giveBirth();
}

class Swan extends Bird implements Swimming, Walking, Flying
{
	 void layEggs() {
		 System.out.println("Swan is laying eggs...");
	 }

	public void fly() {
		System.out.println("Swan is flying....");
	}

	public void walk() {
		System.out.println("Swan is walking....");		
	}
	public void swim() {
		System.out.println("Swan is swimming....");		
	}
	 
}

class Parrot extends Bird implements Walking, Flying
{
	 void layEggs() {
		 System.out.println("Parrot is laying eggs...");
	 }

	public void fly() {
		System.out.println("Parrot is flying....");
	}

	public void walk() {
		System.out.println("Parrot is walking....");		
	}
}

class Bat extends Mammal implements Walking, Flying
{
	 void giveBirth() {
		 System.out.println("Bat is giving birth...");
	 }

	public void fly() {
		System.out.println("Bat is flying....");
	}

	public void walk() {
		System.out.println("Bat is walking....");		
	}
}


class Whale extends Mammal implements Swimming
{
	 void giveBirth() {
		 System.out.println("Whale is giving birth...");
	 }
	 public void swim() {
			System.out.println("Whale is swimming....");		
	 }
}