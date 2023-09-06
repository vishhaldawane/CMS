package jungle.cave;

public class Tiger {
	void jump() {
		System.out.println("Tiger is jumping....");
	}
	 void hunt() {
		System.out.println("Tiger is hunting....");
	}
	 protected void run() {
		 System.out.print("Tiger is running");
	 }
}
class WhiteTiger extends Tiger
{
	void jump() {
		super.hunt();
		System.out.println("White tiger is jumping..");;
	}
}

