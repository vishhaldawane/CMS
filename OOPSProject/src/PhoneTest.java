public class PhoneTest {
	public static void main(String[] args) {		
		Phone myPhone = new Phone();
		myPhone.dial("Divya");		
		byte speedDialCode = 101;
		myPhone.dial(speedDialCode);
		myPhone.dial("Vishal", "Divya");
		myPhone.dial(speedDialCode, "Rajesh");
		myPhone.dial("Seema", speedDialCode);
	}
}
class Phone{
	void dial(String name) { //1
		System.out.println("dial(String) : dialing...."+name);
	}
	void dial(String name1, String name2) {//2
		System.out.println("dial(String,String) : dialing...."+name1 +" and "+name2);
	}
	void dial(byte code) {//3
		System.out.println("dial(byte) : dialing...."+code);
	}
	void dial(byte code, String name) {//4
		System.out.println("dial(byte,String) : dialing...."+code+" for "+name);
	}
	void dial(String name,byte code ) {//5
		System.out.println("dial(String,byte) : dialing...."+code+" for "+name);

	}
	
}