
public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor doctorObj1 = new Doctor();
		Surgeon surgeonObj1 = new Surgeon();
		HeartSurgeon heartSurgeonObj1 = new HeartSurgeon();
	
		if(doctorObj1 instanceof Surgeon) {
			System.out.println("Yes it is a Doctor's object ");
		}
		else {
			System.out.println("No, it not a Surgeon's object ");

		}
		
		if(surgeonObj1 instanceof Surgeon) {
			System.out.println("Yes it is a Surgeon's object ");
		}
		else {
			System.out.println("No, it not a Surgeon's object ");

		}
		
		if(heartSurgeonObj1 instanceof Surgeon) {
			System.out.println("Yes it is a Surgeon's object ");
		}
		else {
			System.out.println("No, it not a Surgeon's object ");

		}
		
		
		
		
		
	}

}

class Doctor {
	
}
class Surgeon extends Doctor {
	
}
class HeartSurgeon extends Surgeon {
	
}