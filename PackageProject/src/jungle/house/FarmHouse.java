package jungle.house;
import jungle.river.Frog;
import jungle.tree.Parrot;

public class FarmHouse {
	public static void main(String[] args) {
		
		System.out.println("Farm house main....");
		Parrot parrot = new Parrot();
		parrot.fly();
		
		Hen hen = new Hen();
		hen.eatRice();
		
		Frog frog = new Frog();
		frog.jump();
		frog.swim();
		frog.hiberate();
	}
}
