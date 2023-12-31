
public class SingleLevelTest {
	public static void main(String[] args) {
		
		Person person = new Person('F',"Jane",23);
		person.showPerson();
		
		System.out.println("----------");
		
		Student student = new Student('M',"Jack",21,1234,"Mech Eng","Bharati VidyaPeeth",9.9f);
		student.showStudent();
		
		System.out.println("----------");
		
		Employee employee = new Employee('F',"Julie",24,4455,"EXTC","Vivekananda Polytechnic",9.5f,8888,"CMS","IT","Analyst","Bengaluru",45000);
		employee.showEmployee();
		
		
	}
}

class Person
{
	char gender;
	String name;
	int age;
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
		
	}
	
}

class Student extends Person
{
	int rollNumber;
	String stream;
	String college;
	float  finalCgp;
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


class Employee extends Student
{
	int empno;
	String companyName;
	String department;
	String designation;
	String location;
	float basicSalary;
	
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

