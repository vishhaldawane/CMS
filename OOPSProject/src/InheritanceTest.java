public class InheritanceTest {
	public static void main(String[] args) {
		Point2D pointObj1 = new Point2D(77,88);

		System.out.println("pointObj1 : "+pointObj1);
		
		Point3D pointObj2 = new Point3D(60,70,80);
		
		System.out.println("pointObj2 : "+pointObj2);
		
		ColouredPoint3D pointObj3 = new ColouredPoint3D(50, 40, 30, "Magenta");
		System.out.println("pointObj3 : "+pointObj3);
		
		
	}
}

class Point2D { //indirectly a child of Object class
	
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
}

class Point3D extends Point2D
{	
	int z; // x and y are also here 
	
	Point3D(int x, int y, int z) {
		super(x,y);//RE-USE the super class code : ctor
		this.z = z; //EXTRA
	}

	@Override
	public String toString() {
		return "Point3D [toString()=" + super.toString() + ", z=" + z + "]";
	}	
}


class ColouredPoint3D extends Point3D
{	
	String color; // x and y are also here 
	
	ColouredPoint3D(int x, int y, int z, String  color) {
		super(x,y,z);//RE-USE the super class code : ctor
		this.color = color; //EXTRA
	}

	@Override
	public String toString() {
		return "ColouredPoint3D [toString()=" + super.toString() + ", color=" + color + "]";
	}

	
	
}

/*
 * 
class Point3D { //indirectly a child of Object class
	
	private int x;
	private int y;
	
	private int z; //extra
	
									//extra
	public Point3D(int x, int y,     int z) {
		
		this.x = x;
		this.y = y;
		
		this.z= z;
	}

	@Override
	public String toString() {							//extra
		return "Point3D [x=" + x + ", y=" + y + ",      z=" + z + "]";
	}

	
	
	

}*/
