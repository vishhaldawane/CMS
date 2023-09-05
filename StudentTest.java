//KISS YAGNI 
public class StudentTest {

	
	public static void main(String[] args) {

	/*	Student student1 = new Student(); //Object creation
		Student student2 = new Student();
		Student student3 = new Student();

		
		student1.setStudent(123, "Amod","Suresh","Nagpal", 20,"Katni", "MP", "India", 123123);
		student2.setStudent(124, "Atul", "K","A",21,"Kasaragoda", "Kerala", "India", 456789);
		student3.setStudent(125, "Shiva","Nandana","S", 19, "Kollam", "Kerala", "India", 456988);

		
		student1.showStudent();
		student2.showStudent();
		student3.showStudent();
		
		System.out.println("--------------------");
		*/
		
		Student javaBatch[] = new Student[17];
		
		for(int i=0;i<javaBatch.length;i++) {
			
			javaBatch[i] = new Student();
			
			javaBatch[i].rollNumber=i+1;
			
			javaBatch[i].showStudent();
			
			System.out.println("---------------");
		}
	}
	
}


class Student //just a design - table
{
	int rollNumber; //FIELD AREA
	String name;
	
	String middleName;
	String lastName;
	
	int age;
	
	String city;
	String state;
	String country;
	int pin;
	
	
	//METHODS			local variables
	void setStudent(int rollNumber, String name, String middleName, String lastName, int age, String city, String state, String country, int pin) {
		this.rollNumber=rollNumber;
		this.name=name;
		
		this.middleName= middleName;
		this.lastName = lastName;
		
		this.age = age;
		
		
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	
	void showStudent() {
		System.out.println("roll no : "+rollNumber);
		System.out.println("name    : "+name);
		System.out.println("mname   : "+middleName);
		System.out.println("lname   : "+lastName);
		System.out.println("age     : "+age);

		System.out.println("city    : "+city);		
		System.out.println("state   : "+state);
		System.out.println("country : "+country);
		System.out.println("pin     : "+pin);
		System.out.println("---------------------");
	}
	
}






/*	int rollNumber=123;
	String name="Amod Nagpal";
	String city="Katni";
	String state="MP";
	String country="India";
	int pin=123123;
			
	System.out.println("roll no : "+rollNumber);
	System.out.println("name    : "+name);
	System.out.println("city    : "+city);		
	System.out.println("state   : "+state);
	System.out.println("country : "+country);
	System.out.println("pin     : "+pin);

	
	int rollNumber1=124;
	String name1="Atul Krishna";
	String city1="Kasaragoda";
	String state1="Kerala";
	String country1="India";
	int pin1=123456;
			
	System.out.println("----------------");
	System.out.println("roll no : "+rollNumber1);
	System.out.println("name    : "+name1);
	System.out.println("city    : "+city1);		
	System.out.println("state   : "+state);
	System.out.println("country : "+country1);
	System.out.println("pin     : "+pin1);

	int rollNumber2=125;
	String name2="Shivanandana S";
	String city2="Kollam";
	String state2="Kerala";
	String country2="India";
	int pin2=123890;
			
	System.out.println("----------------");
	System.out.println("roll no : "+rollNumber2);
	System.out.println("name    : "+name2);
	System.out.println("city    : "+city2);		
	System.out.println("state   : "+state2);
	System.out.println("country : "+country2);
	System.out.println("pin     : "+pin2);
*/

