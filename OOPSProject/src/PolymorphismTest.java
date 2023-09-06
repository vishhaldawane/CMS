
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
	void diagnose() {
		System.out.println("Doctor is diagnosing...by checking ENT....");
	}
}
class Surgeon extends Doctor {
	void diagnose() {
		System.out.println("Surgeon is diagnosing via some blood test and CT Scan...");
	}
}
class HeartSurgeon extends Surgeon {
	void diagnose() {
		System.out.println("HeartSurgeon is diagnosing via a cardiograph....");
	}
	
}