
public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		car.startCar();
	}
}

class Piston
{
	void firePiston() {
		System.out.println("Firing the piston....");
	}
}

class Engine
{
	Piston piston = new Piston();
	
	void startEngine() {
		System.out.println("Engine is started....");
		piston.firePiston();
	}
}

class Vehicle
{
	
}
class Car extends Vehicle //isA
{
	Engine engine1 = new Engine(); //hasA
	
	void startCar() {
		System.out.println("Starting the car....");
		engine1.startEngine();
	}
}
