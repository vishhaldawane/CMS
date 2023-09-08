
public class Testing2 {
	public static void main(String[] args) {
		
		Playing p = new FootBall();
		p.play();
		
		
	}
}

interface Drinking
{
	void drink();
}

class Human implements Drinking {
	
	
	
	public void drink() {
		
		System.out.println("Human is drinking water");
		
	}
	public void talk() {
		
	}
}

interface Playing
{
	void play();
}
class FootBall implements Playing
{
	Drinking d = new Human();
	
	public void play() {
		d.drink();
		System.out.println("FootBall Playing....");
		d.drink();
	}
}