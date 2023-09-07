
public class AbstractTest {
	public static void main(String[] args) {
		//GeometricalShape gs = new  GeometricalShape();
		
		Circle circle = new Circle(45);
		circle.draw();
		circle.calcArea();
		
		Square square= new Square(78);
		square.draw();
		square.calcArea();
		
		System.out.println("-------");
		
		GeometricalShape shape; //super class handle / reference
		
		shape = circle; //assing the child to it
		
		shape.draw();
		shape.calcArea();
		
		shape = square; //re-assign a new child to it
		
		shape.draw();
		shape.calcArea();
	}
}

abstract class GeometricalShape //must be kept in an abstract class
{
	 void fillColor() { //2.inherited to Circle
		 System.out.println("fill color invoked....");
	 } 
	 
	 //partial contract / incomplete function
	 abstract void draw();
	 abstract void calcArea();
}

class Circle extends GeometricalShape
{
	float radius;
	private final static float PI=3.14f;
	
	Circle(float rad) {
		radius = rad;
	}
	
	void calculateEccentricity() { //1. exclusive
		System.out.println("if its zero..means its a circle...else it is oval...");
	}
	void fillColor() { //3. overriding
		System.out.println("filling circle.....");
	}
	void draw() { //4. implemented [ MANDATORY ]
		System.out.println("drawing a circle...");
	}
	void calcArea() {
		float area = radius * radius * PI;
		System.out.println("area  : "+area);
	}
}


class Square extends GeometricalShape
{
	float side;
	
	Square(float side) {
		this.side = side;
	}
	

	void fillColor() { //3. overriding
		System.out.println("filling color in square.....");
	}
	void draw() { //4. implemented [ MANDATORY ]
		System.out.println("drawing a square...");
	}
	void calcArea() {
		float area = side * side ;
		System.out.println("area  : "+area);
	}
}



