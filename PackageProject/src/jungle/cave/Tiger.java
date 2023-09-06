package jungle.cave;

public class Tiger {
	
	int           defaultA=10;
	private int   privateB=20;
	protected int protectedC=30;
	public int    publicD=40;
	
	void jump() {
		System.out.println("Tiger is jumping....");
	}
	 void hunt() {
		System.out.println("Tiger is hunting....");
	}
	 protected void run() {
		 System.out.print("Tiger is running");
	 }
	 void show() {
		 	System.out.println("defaultA   "+defaultA);
			System.out.println("privateB   "+privateB);
			System.out.println("protectedC "+protectedC);
			System.out.println("publicD    "+publicD);
			
	 }
}
class WhiteTiger extends Tiger
{
	void jump() {
		
		System.out.println("defaultA   "+super.defaultA);
		System.out.println("privateB   "+super.privateB);
		System.out.println("protectedC "+super.protectedC);
		System.out.println("publicD    "+super.publicD);
		
		System.out.println("White tiger is jumping..");;
	}
}


