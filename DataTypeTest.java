import java.math.BigInteger;

public class DataTypeTest {
	public static void main(String[] args) {
		
		System.out.println("Begin main");
		
		byte rollNumber=120;
		short universityRollNumber=32767;
		int socialSecurityNumber=120000;
		long policyNumber=1234123412;
				
		float rateOfInterest=12.5f;
		double molecularDistance=1.22444;
		
		char gender='F';
		
		boolean isCertified=true;
		
		String name="Amod Nagpal";
		String city  ="Katni";
		String state ="Madhya Pradesh";
		String country = "India";
		int pin = 483501;
		
		System.out.println("details "+name+" is from "+city+" of "+state+" in "+country+" pin is "+pin);
		
		System.out.println("your roll number is  : "+rollNumber);
		System.out.println("your university roll : "+universityRollNumber);
		System.out.println("social security no   : "+socialSecurityNumber);
		System.out.println("policy number is     : "+policyNumber);
		
		System.out.println("rate of interest : "+rateOfInterest);
		System.out.println("molecular distance : "+molecularDistance);
		
		System.out.println("your gender is : "+gender);
		System.out.println("are you certified : "+isCertified);
		
		System.out.println("End main");
	}
}
