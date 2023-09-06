package jungle.tree;

import jungle.cave.Tiger;
import jungle.river.Frog;
class Monkey 
{
	void jump() {
		Tiger tiger = new Tiger();
		tiger.hunt();
		tiger.run();
	}
}

public class Parrot {
	public void fly() {
		System.out.println("Parrot is flying....");
		Frog frog = new Frog();
		frog.swim();
	}
}
