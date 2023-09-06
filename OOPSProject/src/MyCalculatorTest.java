
public class MyCalculatorTest {
	public static void main(String[] args) {
		
		Calculator calci = new Calculator();
		
		calci.add();
		System.out.println("-------------");
		
		calci.sum(10, 20);
		System.out.println("-------------");

		float answer = calci.findAverage(520, 630, 720);
		System.out.println("The average is : "+answer);
		System.out.println("-------------");

		float pi = calci.whatIsPi();
		System.out.println("the pi value is : "+pi);
		System.out.println("-------------");
		
		double dist = calci.calculateDistanceBetweenEarthAndSun();
		System.out.println("distance is : "+dist);

	}
}

class Calculator
{
	
	void add() {
		System.out.println("add() no arg, no return");
	}
	
	void sum(int i, int j) {
		System.out.println("sum(int,int) with 2 args, but no return");
		int k = i+j;
		System.out.println("sum is : "+k);
	}
	
	float findAverage(int i, int j, int k) {
		System.out.println("findAverage(int,int,int)..with 3 args, and with return value");
		float avg = (i+j+k)/3.0f;
		return avg; // dont forget to return value 
	}
	
	float whatIsPi() {
		System.out.println("whatIsPI() without arg, but with return value...");
		return 3.14f;
	}
	double calculateDistanceBetweenEarthAndSun() { 
		return 480 * 186000.519; //miles per seconds
	}
	
}
