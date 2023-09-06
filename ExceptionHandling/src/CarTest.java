
public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("Begin main ");
		
		try {
			Car car = new Car();
			car.startCar();
			car.longDrive();

		} 
		catch (CarKeyNotFoundException e) {
			System.out.println("Some Problem : "+e);
		}
		
		System.out.println("End main ");
		
	}
}


class Car
{
	String model;
	boolean keyFound;
	
	//throws clause is not mandatory for unchecked exceptions
	
	Car() throws CarKeyNotFoundException //this line is mandatory since the exception is of TYPE : checked 
	{
		System.out.println("Car() constructor...");
		double val = Math.random()%10;
		//System.out.println("val "+val);
		if(val > 0.50) {
			keyFound=true;
		}
		else {
			//System.out.println("Car key not found....");
			//throw new RuntimeException("Car key not found...");
			
			CarKeyNotFoundException e = new CarKeyNotFoundException("Oh No!!! Where is the car key????");
			throw e;
		}
	}
	
	void startCar() {
		System.out.println("Starting the car...");
		if(keyFound==true) {
			System.out.println("Car is started.....");
		}
		else {
			System.out.println("Car key not found...");
		}
	}
	
	void longDrive()  //throws is not mandatory
	{
		System.out.println("long Drive started.....");
		
		for(int i=1;i<=30;i++) {
			System.out.println(i+" kms driven....");
			double val = Math.random()%10;
			if(val>0.90) {
				throw new RedSignalDishonouredException("Oh No!!Red signal dishonoured....");
					
			}
		}
		
		System.out.println("long Drive finished.....");

	}
}

//checked exception
class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}


//unchecked exception
class RedSignalDishonouredException extends RuntimeException
{
	RedSignalDishonouredException(String msg) {
		super(msg);
	}
}





