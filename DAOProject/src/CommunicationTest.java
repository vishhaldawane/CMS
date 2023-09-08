
public class CommunicationTest {
	public static void main(String[] args) {
		Vishal vishal = new Vishal();
		vishal.talk();
		
	}
}

class Vishal
{
	Ankita ankita = new Ankita(); //hasA
	void talk() {
		System.out.println("Today the class is till 8pm");
		ankita.talk();
		System.out.println("WHATS UP...LETS STAY TUNE");
	}
}
class Ankita
{
	Varada varada = new Varada();//hasA
	void talk() {
		System.out.println("Hello guys, since u all have to complete \n the assignments the trainer has given a msg...");
		varada.talk();
		System.out.println("COME ON  GUYS YOU ALL CAN DO IT");
	}
}

class Varada
{
	void talk() {
		System.out.println("You all have to complete Hacker Rank, hence class is extended by 2 hours");
	}
}
