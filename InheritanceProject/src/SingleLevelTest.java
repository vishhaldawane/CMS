
public class SingleLevelTest {
	public static void main(String[] args) {
		
		
		
		Person person = new Person('F',"Jane",23);
		person.card.setAdhaarCard("Jane Dsouza", "123412341234", "Kerala", "10-Jan-2000", "98765 43321");
		person.pan.setPanCard("JTRES3456A", "Peter Dsouze");
		person.showPerson();
		
		System.out.println("\n**************\n");
		
		Student student = new Student('M',"Jack",21,1234,"Mech Eng","Bharati VidyaPeeth",9.9f);
		student.card.setAdhaarCard("Jack Dmellow", "523452345234", "Goa", "10-Feb-2001", "88765 48822");
		student.pan.setPanCard("JQWE3586B", "Smith Dmellow");

		student.showStudent();
		
		System.out.println("\n**************\n");
		
		Employee employee = new Employee('F',"Julie",24,4455,"EXTC","Vivekananda Polytechnic",9.5f,8888,"CMS","IT","Analyst","Bengaluru",45000);
		employee.card.setAdhaarCard("Julie Abraham", "567823452345", "Mumbai", "12-Dec-2002", "45678 23456");
		employee.pan.setPanCard("JUTYU1234T", "Micheal Abraham");
		employee.showEmployee();
		
		
	}
}

class AdhaarCard
{
	String nameOnAdhaar;
	String adhaarCardNumber;
	String address;
	String birthdate;
	String phoneNumber;
	
	void setAdhaarCard(String nameOnAdhaar, String adhaarCardNumber, String address, String birthdate,
			String phoneNumber) {	
		this.nameOnAdhaar = nameOnAdhaar;
		this.adhaarCardNumber = adhaarCardNumber;
		this.address = address;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
	}
	
	void showAdhaarCard() {
		System.out.println("---ADHAAR INFO-----");
		System.out.println("Name On Adhaar : "+nameOnAdhaar);
		System.out.println("Adhaar Card No : "+adhaarCardNumber);
		System.out.println("Address        : "+address);
		System.out.println("Birthdate      : "+birthdate);
		System.out.println("Phone Number   : "+phoneNumber);
	}
	
	
}


class PanCard
{
	String pancardNumber;
	String fatherName;
	
	public void setPanCard(String pancardNumber, String fatherName) {
		this.pancardNumber = pancardNumber;
		this.fatherName = fatherName;
	}


	void showPanCard() {
		System.out.println("---PAN INFO-----");
		System.out.println("Pan Card No    : "+pancardNumber);
		System.out.println("Father Name    : "+fatherName);
		
	}
	
	
}
class Passport{
	void showPassport() {
		System.out.println("showing passport.....");
	}
}
class DrivingLicense {
	void showDrivingLicense() {
		System.out.println("showing driving license.....");
	}
}


class Person
{
	char gender;//hasA
	String name;//hasA
	int age; //has
	AdhaarCard card = new AdhaarCard(); //hasA
	PanCard pan = new PanCard();
	
	Passport passport = new Passport();
	DrivingLicense drivingLicense = new DrivingLicense();
	
	
	public Person(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	void showPerson() {
		System.out.println("---PERSONAL INFO-----");
		
		System.out.println("gender : "+gender);
		System.out.println("name   : "+name);
		System.out.println("age    : "+age);
		card.showAdhaarCard();
		pan.showPanCard();
		passport.showPassport();
		drivingLicense.showDrivingLicense();
	}
	
}

class Student extends Person //isA
{
	int rollNumber;//hasA
	String stream;//hasA
	String college;//hasA
	float  finalCgp;//hasA
	
	//ReportCard
	
	public Student(char gender, String name, int age, int rollNumber, String stream, String college, float finalCgp) {
		super(gender, name, age);
		this.rollNumber = rollNumber;
		this.stream = stream;
		this.college = college;
		this.finalCgp = finalCgp;
	}
	

	void showStudent() {
		super.showPerson(); //reuse the super class code
		System.out.println("---STUDENT INFO-----");
		System.out.println("roll   : "+rollNumber);
		System.out.println("stream : "+stream);
		System.out.println("college: "+college);
		System.out.println("cgp    : "+finalCgp);

	}

}


class Employee extends Student //isA
{
	int empno; //hasA
	String companyName; //hasA
	String department; //hasA
	String designation; //hasA
	String location; //hasA
	float basicSalary; //hasA
	
	//SalarySlip
	
	
	public Employee(char gender, String name, int age, int rollNumber, String stream, String college, float finalCgp,
			int empno, String companyName, String department, String designation, String location, float basicSalary) {
		super(gender, name, age, rollNumber, stream, college, finalCgp);
		this.empno = empno;
		this.companyName = companyName;
		this.department = department;
		this.designation = designation;
		this.location = location;
		this.basicSalary = basicSalary;
	}
	
	void showEmployee() {
		super.showStudent(); //reuse the super class code
		System.out.println("---EMPLOYEE INFO-----");
		System.out.println("empno  : "+empno);
		System.out.println("compnay: "+companyName);
		System.out.println("dept   : "+department);
		System.out.println("desg   : "+designation);
		System.out.println("loca   : "+location);
		System.out.println("salary : "+basicSalary);
	}
	
	
}

