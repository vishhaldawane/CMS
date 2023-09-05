
public class Test {

	public static void main(String[] args) {

		System.out.println("Begin main");
		System.out.println("Its wonderfull to work here in IDE");
	
		Farmer farmer1 = new Farmer();
		farmer1.farming();
		farmer1.sellCrop();
		
		
		
		
	}

}

class Farmer {
	void farming() {
		System.out.println("Farmer is farming...");
	}
	void sellCrop() {
		System.out.println("Farmer is selling crop...");
	}
}

class Insurance {
	void claim() {
		System.out.println("Claiming insurance....");
	}
}

class Shopping {
	void addItem() {
		System.out.println("Adding item to the cart...");
	}
	
	
}


/*

	javac Test.java
	java  Test

*/