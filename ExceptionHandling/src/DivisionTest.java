
public class DivisionTest {
	public static void main(String[] args) {
		
		System.out.println("MAIN BEGIN");
		
		Calculator calci = new Calculator();
		
		try {
			calci.divide(100, 0);
		}
		catch(ArithmeticException e) {
			System.out.println("Some problem : "+e);
		}
		
		try {
			calci.divide(100, 2);
		}
		catch(ArithmeticException e) {
			System.out.println("Some problem : "+e);
		}
		
		try {
			calci.divide(100, 3);
		}
		catch(ArithmeticException e) {
			System.out.println("Some problem : "+e);
		}
		
		
		
		System.out.println("MAIN END");
		
	}
}
//double slit experiment - dr. quantum

class Calculator
{
	void divide(int num, int deno) {	
		System.out.println("\n==DIVISION STARTED==");
		System.out.println("numerator   : "+num);
		System.out.println("denominator : "+deno);
		System.out.println("trying to divide "+num+" by "+deno);
		int division = num / deno; //susceptible to throw exception of type ArithmeticException
		System.out.println("division is : "+division);
		System.out.println("==DIVISION OVER==");
	}
}
