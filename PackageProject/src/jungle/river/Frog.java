package jungle.river;

public class Frog {
	public void jump() {
		System.out.println("Frog is jumping....");
	}
	public void swim() {
		System.out.println("Frog is swimming...");
	
	}
	private void hibernate() {
		System.out.println("Frog is hiding itself....");
	}
}
class Snake
{
	void crawling() {
		Frog frog = new Frog();
		frog.swim();
		frog.hibernate();
	}
}