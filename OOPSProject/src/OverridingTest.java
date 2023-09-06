
public class OverridingTest {
	public static void main(String[] args) {
		
		Doctor doctor = new Doctor();
		doctor.diagnose();//overriding
		
		doctor = new Surgeon();
		doctor.diagnose();//overriding
		
		doctor = new HeartSurgeon();
		doctor.diagnose();//overriding
		
		
		
		Phone phone = new Phone();
		
		phone.dial("Jack"); //overloading
		phone.dial("Jane", "Julie"); //overloading
		
	}
}
