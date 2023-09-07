
public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle(45.5f);
		circle.showCircle();
		circle.area();
	}
}

class Circle
{
	float radius;
	final float PI=3.14f; //now it is a data member

	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	void showCircle() {
		System.out.println("Circle radius : "+radius);
	}
	void area() {
		
		PI=3.18f;
		
		float area = PI * radius * radius;
		System.out.println("Area : "+area);
	}
}
